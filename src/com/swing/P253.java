package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class P253 extends JFrame{
	private JLabel accountLbl,passwordLbl;
	private JTextField accountField;
	private JPasswordField passwordField;
	private JButton enterBtn;
	public P253(String title){
		setTitle(title);
		setSize(280,160);
		this.setLocationRelativeTo(null);//������ʾ
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//�����ر�
		setResizable(false);//���ô����С���ɸı�
		
		accountLbl = new JLabel("�û��˻���");
		passwordLbl = new JLabel("�û����룺");
		accountField = new JTextField(20);
		passwordField = new JPasswordField(20);
		enterBtn = new JButton("��½");
		setLayout(null);
		accountLbl.setBounds(30,10,60,20);
		passwordLbl.setBounds(30,40,60,20);
		accountField.setBounds(90,10,150,20);
		passwordField.setBounds(90,40,150,20);
		enterBtn.setBounds(50,70,180,40);
		add(accountLbl);
		add(passwordLbl);
		add(accountField);
		add(passwordField);
		add(enterBtn);
		setVisible(true);
	}
	public static void main(String[] args) {
		new P253("qq��½����");

	}

}
