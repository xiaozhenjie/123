package com.swing;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class test111111111111111111111 {

	public static void main(String[] args) {
		new Demo5(280,170,"登陆窗口");

	}

}
class Demo5 extends JFrame{
	private int width;//窗口宽度
	private int height;//窗口高度
	private JLabel accountLbl,passwordLbl,roleLbl;
	private JTextField accountField;
	private JPasswordField passwordField;
	private JButton enterBtn,exitBtn;
	private JComboBox roleCombox;
	public Demo5(){
		this.width = 280;
		this.height = 170;
	}
	
	public Demo5(int width,int height,String title){
		super(title);
		setSize(width,height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		accountLbl = new JLabel("用户账户：");
		passwordLbl = new JLabel("用户密码：");
		accountField = new JTextField(20);
		passwordField = new JPasswordField(20);
		enterBtn = new JButton("登录");
		exitBtn = new JButton("退出");
		roleLbl = new JLabel("用户身份：");
		roleCombox = new JComboBox(new String[] {"管理员","学生","教师"});
		
		setLayout(null);

		accountLbl.setBounds((int)(width/8),(int)(height/16),(int)(width/4),(int)(height/8));
		accountField.setBounds((int)(3*width/8),(int)(height/16),(int)(width/2),(int)(height/8));
		passwordLbl.setBounds((int)(width/8),(int)(height/4),(int)(width/4),(int)(height/8));
		passwordField.setBounds((int)(3*width/8),(int)(height/4),(int)(width/2),(int)(height/8));
		roleLbl.setBounds((int)(width/8),(int)(7*height/16),(int)(width/4),(int)(height/8));
		roleCombox.setBounds((int)(3*width/8),(int)(7*height/16),(int)(width/2),(int)(height/8));
		enterBtn.setBounds((int)(width/8),(int)(5*height/8),(int)(5*width/16),(int)(height/8));
		exitBtn.setBounds((int)(9*width/16),(int)(5*height/8),(int)(5*width/16),(int)(height/8));
		add(accountLbl);
		add(accountField);
		add(passwordLbl);
		add(passwordField);
		add(roleLbl);
		add(roleCombox);
		add(enterBtn);
		add(exitBtn);
		setVisible(true);
	}
	
	
}