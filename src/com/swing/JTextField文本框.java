package com.swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextField�ı��� {

	public static void main(String[] args) {
		new JTextFieldDemo();
		
	}

}
class JTextFieldDemo extends JFrame{
	private JTextField accountField1,accountField2,accountField3;
	public JTextFieldDemo(){
		this("JTextField�ı���");
	}
	public JTextFieldDemo(String title){
		setTitle(title);
		this.setBounds(400,400,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accountField1 = new JTextField("ָ����ʾ����1");
		accountField2 = new JTextField("ָ����ʾ����2");
		accountField3 = new JTextField("ָ����ʾ����3");
		this.setLayout(null);
		accountField1.setBounds(30,30,200,30);
		accountField2.setBounds(30,70,200,30);
		accountField3.setBounds(30,110,200,30);
		accountField3.transferFocus();
		add(accountField1);
		add(accountField2);
		add(accountField3);
		
		
		setVisible(true);
		
	}
	
}