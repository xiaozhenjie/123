package com.项目4答题;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class test {

	public static void main(String[] args) {
		new Window("练习");
	}

}
class Window extends JFrame{
	Random ran = new Random();
	private int num = 0;//结果
	private int num1;//第一个数
	private int num2;//第二个数
	private int num3;//加减乘除下标
	private double nums;//除法运算有小数时结果
	private boolean b;//接收isTrue方法返回值
	private int i=0;//题目数量
	char[] c = {'+','-','x','/'};
	public Window(String title){
		super(title);
		setSize(400,100);
		this.setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		//产生3个随机数
		num1=ran.nextInt(100);
		num2=ran.nextInt(100);
		num3=ran.nextInt(4);
		
		JLabel Lbl = new JLabel(""+num1+c[num3]+num2+"=",JLabel.CENTER);
		
		contentPane.add(Lbl);
		
		JTextField text = new JTextField(10);
		
		contentPane.add(text);
		
		text.addKeyListener(new KeyListener() {
			
			//输入
			public void keyTyped(KeyEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			//释放
			public void keyReleased(KeyEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			//按下
			public void keyPressed(KeyEvent e) {
					if(e.getKeyChar()=='\n'){
						switch(num3){
						case 0:
							num=num1+num2;
							break;
						case 1:
							num=num1-num2;
							break;
						case 2:
							num=num1*num2;
							break;
						case 3:
							num=num1/num2;
							break;
						}
						b=isTrue(num,text);
						//除法运输且有小数时
						if(num3==3&&num1%num2!=0){
							NumberFormat nf=NumberFormat.getInstance();
							nf.setMaximumFractionDigits(2);
							nums=(double)(num1)/(double)(num2);
							b=isTrue(new BigDecimal(nf.format(nums)),text);
						}
						if(b){
							++i;
							JOptionPane.showMessageDialog(null, "恭喜你回答正确！");
							if(i>=20){
								JOptionPane.showMessageDialog(null,"今天就到这里吧，明天再练！");
								System.exit(0);
							}
							num1=ran.nextInt(100);
							num2=ran.nextInt(100);
							num3=ran.nextInt(4);	
							if(num3==3&&num2==0){
								num2=ran.nextInt(99)+1;
							}
							Lbl.setText(""+num1+c[num3]+num2+"=");
							text.setText("");
						}else{
							JOptionPane.showMessageDialog(null, "回答错误，请重新答题！");
							text.setText("");
						}
						
					}
			}
		});

		
		setVisible(true);
	}
	//判断输入答案是否正确
	public boolean isTrue(int num ,JTextField text){
		return (""+num).equals(text.getText());
	}
	//考虑除法运算小数
	public boolean isTrue(BigDecimal nums ,JTextField text){
		return (""+nums).equals(text.getText());
	}
}