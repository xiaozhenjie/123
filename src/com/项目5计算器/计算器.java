package com.项目5计算器;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class 计算器 {

	public static void main(String[] args) {
		new Window();

	}

}
class Window extends JFrame{
	private boolean z = false;//判断开头是否有+-
	public Window(){
		super("计算器");
		setSize(400,300);
		setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		JTextField text = new JTextField(20);
		
		contentPane.add(text, BorderLayout.NORTH);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);//退出JVM
			}
		});
		//中部
		JPanel p1 = new JPanel(new GridLayout(4, 4,5,5));
		contentPane.add(p1, BorderLayout.CENTER);
		JButton[] Btn = {new JButton("7"),new JButton("8"),new JButton("9"),new JButton("+"),
				new JButton("4"),new JButton("5"),new JButton("6"),new JButton("-"),
				new JButton("3"),new JButton("2"),new JButton("1"),new JButton("*"),
				new JButton("0"),new JButton("."),new JButton("="),new JButton("/")};
		for(JButton x:Btn){
			p1.add(x);
			if(x==Btn[7]||x==Btn[13]||x==Btn[14]){continue;}
			if(x==Btn[3]||x==Btn[11]||x==Btn[15]){
				x.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String str = text.getText();
						if(!str.equals("")&&str.charAt(str.length()-1)!='+'
								&&str.charAt(str.length()-1)!='-'
								&&str.charAt(str.length()-1)!='*'
								&&str.charAt(str.length()-1)!='/'
								&&str.charAt(str.length()-1)!='.'){
							text.setText(text.getText()+x.getText());
						}
						System.gc();
					}
				});
			}else{
				x.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						text.setText(text.getText()+x.getText());
						System.gc();
						
					}
				});
			}
			
		}
		//
		Btn[7].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = text.getText();
				if(str.equals("")||str.charAt(str.length()-1)!='-'&&str.charAt(str.length()-1)!='+'){
					text.setText(text.getText()+Btn[7].getText());
				}
				System.gc();
			}
		});
		//.按钮设置
		Btn[13].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = text.getText();
				int beginIndex = find_left(new StringBuilder(str), str.length());
				boolean b=true;
				for(int i = beginIndex;i<str.length();i++){
					if(str.charAt(i)=='.'){
						b=false;
					}
				}
				if(b&&(str.length()==0||str.charAt(str.length()-1)!='.')){
					text.setText(text.getText()+Btn[13].getText());
				}
				System.gc();
			}
		});
		//=
		Btn[14].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//格式化数字
				StringBuilder sb=jisuan(new StringBuilder(text.getText()));
				
				if(sb.length()!=1&&sb.indexOf(".")>0){
					for(int i=sb.length()-1;i>=0;i--){
						if(sb.charAt(i)=='0'){
							sb.deleteCharAt(i);
						}else if(sb.charAt(i)=='.'){
							sb.deleteCharAt(i);
							break;
						}else{
							break;
						}
					}
				}
				text.setText(sb.toString());
				//释放内存
				System.gc();
			}
		});
		p1.add(Btn[14]);
		setVisible(true);
	}
	public StringBuilder jisuan(StringBuilder stbu){
		for(int i=0;i<stbu.length();i++){
			if(stbu.charAt(i)=='*'||stbu.charAt(i)=='/'){
				BigDecimal left_BigDe= new BigDecimal(stbu.substring(find_left(stbu,i), i));
				int num=i;
				if(stbu.charAt(i+1)=='-'){
					num=i+1;
				}
				String str = stbu.substring(i+1,find_right(stbu,num));
				if(str.equals(".")){
					str="0";
				}
				BigDecimal right_BigDe = new BigDecimal(str);
				if(stbu.charAt(i)=='*'){
					int right;
					if(stbu.charAt(i+1)=='-'){
						 right=find_right(stbu,i+1);
					}else{
						right=find_right(stbu, i);
					}
					stbu.replace(find_left(stbu,i),right, left_BigDe.multiply(right_BigDe).toString());
				}else{
					if(right_BigDe.equals(new BigDecimal(0))){
						JOptionPane.showMessageDialog(null, "除数不能为0");
						stbu.setLength(0);
						break;
					}
					int right;
					if(stbu.charAt(i+1)=='-'){
						 right=find_right(stbu,i+1);
					}else{
						right=find_right(stbu, i);
					}
					stbu.replace(find_left(stbu,i),right, left_BigDe.divide(right_BigDe,20,BigDecimal.ROUND_UP).toString());
				}
				i=0;
			}
		}
		for(int z=0;z<stbu.length()-1;z++){
			if(stbu.charAt(z)=='-'&&stbu.charAt(z+1)=='-'){
				stbu.replace(z,z+2,"+");
				if(stbu.charAt(0)=='+'){stbu.deleteCharAt(0);}
				z=-1;
			}
		}
		for(int z=0;z<stbu.length()-1;z++){
			if(stbu.charAt(z)=='+'&&stbu.charAt(z+1)=='-'){
				stbu.replace(z,z+2,"-");
				z=-1;
			}
		}
		for(int z=0;z<stbu.length()-1;z++){
			if(stbu.charAt(z)=='+'&&stbu.charAt(z+1)=='+'){
				stbu.replace(z,z+2,"+");
				z=-1;
			}
		}
		for(int j=0;j<stbu.length();j++){

			if(stbu.charAt(j)=='+'||stbu.charAt(j)=='-'){
				//判断开头是否有符号+或-
				if(j==0){
					continue;
				}
				BigDecimal left_BigDe= new BigDecimal(stbu.substring(0, j));
				String str = stbu.substring(j+1,find_right(stbu,j));
				if(str.equals(".")){
					str="0";
				}
				BigDecimal right_BigDe = new BigDecimal(str);
				
				if(stbu.charAt(j)=='+'){
					stbu.replace(0, find_right(stbu,j),left_BigDe.add(right_BigDe).toString());
				}else{
					stbu.replace(0, find_right(stbu,j),left_BigDe.subtract(right_BigDe).toString());
				}			
				j=-1;
			}
		}
		return stbu;
	}

	//寻找左边+或-符号下标        这里添加的 * /只运用于  .的输入判断，不为.增加健壮性可删除 * / 判断
	public int find_left(StringBuilder stbu,int num){
		while(num>0){
			num--;
			if(stbu.charAt(num)=='+'||stbu.charAt(num)=='-'||stbu.charAt(num)=='*'||stbu.charAt(num)=='/'){
				return num+1;
			}
		}
		return 0;
	}
	//寻找右边+或-或*或/符号下标
	public int find_right(StringBuilder stbu,int num){
		while(num<stbu.length()-1){
			num++;
			if(stbu.charAt(num)=='+'||stbu.charAt(num)=='-'||stbu.charAt(num)=='*'||stbu.charAt(num)=='/'){
				return num;
			}
		}
		return stbu.length();
	}

}
