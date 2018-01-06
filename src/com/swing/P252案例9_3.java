package com.swing;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class P252案例9_3 extends JFrame{
	private JLabel accountLbl,passwordLbl,roleLbl;
	private JTextField accountField;
	private JPasswordField passwordField;
	private JButton enterBtn,exitBtn;
	private JComboBox roleCombox;
	
	public P252案例9_3(String title){
		//-----------（1）创建窗体----------------
		setTitle(title);//设置窗体标题
		setSize(280,170);//设置窗体大小
		this.setLocationRelativeTo(null);//居中显示
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//正常关闭窗体
		setResizable(false);//设置窗体大小不可变
		
		//-------------（2）创建界面元素---------------
		accountLbl = new JLabel("用户账号：");//创建一个Label对象显示用户账号
		passwordLbl = new JLabel("用户密码：");//创建一个Label对象显示用户密码
		roleLbl = new JLabel("用户身份：");//创建一个Label对象显示用户身份
		accountField = new JTextField(20);//创建JTextField对象并设置显示列数为20列
		passwordField = new JPasswordField(20);//创建JPasswordField对象并设置显示列数为20列
		enterBtn = new JButton("登录");//创建一个显示文本为登录的JButton对象
		exitBtn =new JButton("退出");//创建一个显示文本为退出的JButton对象
		//创建一个显示内容为管理员、学生、教师的组合框
		roleCombox = new JComboBox(new String[] {"管理员","学生","教师"});
		setLayout(null);//设置布局为空布局
		accountLbl.setBounds(30,10,60,20);
		passwordLbl.setBounds(30,40,60,20);
		roleLbl.setBounds(30,70,60,20);
		accountField.setBounds(90,10,150,20);
		passwordField.setBounds(90,40,150,20);
		roleCombox.setBounds(90,70,150,20);
		enterBtn.setBounds(30,100,100,20);
		exitBtn.setBounds(140,100,100,20);
		//将上述组件添加到顶层窗口中
		add(accountLbl);
		add(passwordLbl);
		add(accountField);
		add(passwordField);
		add(roleLbl);
		add(roleCombox);
		add(enterBtn);
		add(exitBtn);
		setVisible(true);//显示窗体
		
	}
	
	public static void main(String[] args) {
		new P252案例9_3("学生信息管理系统-登录系统");

	}

}
