package com.��Ŀ4����;

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
		new Window("��ϰ");
	}

}
class Window extends JFrame{
	Random ran = new Random();
	private int num = 0;//���
	private int num1;//��һ����
	private int num2;//�ڶ�����
	private int num3;//�Ӽ��˳��±�
	private double nums;//����������С��ʱ���
	private boolean b;//����isTrue��������ֵ
	private int i=0;//��Ŀ����
	char[] c = {'+','-','x','/'};
	public Window(String title){
		super(title);
		setSize(400,100);
		this.setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		//����3�������
		num1=ran.nextInt(100);
		num2=ran.nextInt(100);
		num3=ran.nextInt(4);
		
		JLabel Lbl = new JLabel(""+num1+c[num3]+num2+"=",JLabel.CENTER);
		
		contentPane.add(Lbl);
		
		JTextField text = new JTextField(10);
		
		contentPane.add(text);
		
		text.addKeyListener(new KeyListener() {
			
			//����
			public void keyTyped(KeyEvent e) {
				// TODO �Զ����ɵķ������
				
			}
			
			//�ͷ�
			public void keyReleased(KeyEvent e) {
				// TODO �Զ����ɵķ������
				
			}
			
			//����
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
						//������������С��ʱ
						if(num3==3&&num1%num2!=0){
							NumberFormat nf=NumberFormat.getInstance();
							nf.setMaximumFractionDigits(2);
							nums=(double)(num1)/(double)(num2);
							b=isTrue(new BigDecimal(nf.format(nums)),text);
						}
						if(b){
							++i;
							JOptionPane.showMessageDialog(null, "��ϲ��ش���ȷ��");
							if(i>=20){
								JOptionPane.showMessageDialog(null,"����͵�����ɣ�����������");
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
							JOptionPane.showMessageDialog(null, "�ش���������´��⣡");
							text.setText("");
						}
						
					}
			}
		});

		
		setVisible(true);
	}
	//�ж�������Ƿ���ȷ
	public boolean isTrue(int num ,JTextField text){
		return (""+num).equals(text.getText());
	}
	//���ǳ�������С��
	public boolean isTrue(BigDecimal nums ,JTextField text){
		return (""+nums).equals(text.getText());
	}
}