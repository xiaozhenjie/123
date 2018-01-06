package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Demo1 {

	public static void main(String[] args) {
		new Window_13132("用户登入界面");

	}

}
class Window_13132 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6729856114430066135L;
	public Window_13132(){
		this("窗口");
	}
	public Window_13132(String title){
		super(title);
		setSize(300,200);
		setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JLabel Lbl = new JLabel("新用户注册",JLabel.CENTER);
		contentPane.add(Lbl,BorderLayout.NORTH);
		
		JPanel p1 = new JPanel(new GridLayout(3,2));
		JLabel accountLbl = new JLabel("用户名：",JLabel.CENTER);
		JTextField accountField = new JTextField(10);
		JLabel passwordLbl = new JLabel("密码：",JLabel.CENTER);
		JPasswordField passwordField = new JPasswordField(10);
		JLabel ispasswordLbl = new JLabel("确认密码：",JLabel.CENTER);
		JPasswordField ispasswordField = new JPasswordField(10);
		
		p1.add(accountLbl);
		p1.add(accountField);
		p1.add(passwordLbl);
		p1.add(passwordField);
		p1.add(ispasswordLbl);
		p1.add(ispasswordField);
		
		contentPane.add(p1, BorderLayout.CENTER);
		
		JPanel p2 = new JPanel();
		JButton btn = new JButton("提交");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				char[] ps = passwordField.getPassword();
				char[] isps = ispasswordField.getPassword();
				if(Arrays.equals(ps, isps)){
					JOptionPane.showMessageDialog(null,accountField.getText()+"注册成功！");

					new Window_ads("登录",accountField.getText(),ps);
					
					
				}else{
					JOptionPane.showMessageDialog(null, "两次密码输入不一致");
					passwordField.setText("");
					ispasswordField.setText("");
				}
			}
		});
		p2.add(btn);
		contentPane.add(p2,BorderLayout.SOUTH);
		setVisible(true);
	}
}
class Window_ads extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 444277912795841602L;

	public Window_ads(String title,String user,char[] ps){
		super(title);
		setSize(300,200);
		setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JLabel Lbl = new JLabel("用户登入页面",JLabel.CENTER);
		contentPane.add(Lbl,BorderLayout.NORTH);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel accountLbl = new JLabel("用户名：",JLabel.CENTER);
		JTextField accountField = new JTextField(10);
		JLabel passwordLbl = new JLabel("密码：",JLabel.CENTER);
		JPasswordField passwordField = new JPasswordField(10);
		
		p1.add(accountLbl);
		p1.add(accountField);
		p1.add(passwordLbl);
		p1.add(passwordField);
		
		contentPane.add(p1, BorderLayout.CENTER);
		
		JPanel p2 = new JPanel();
		JButton enterBtn = new JButton("登录");
		enterBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user1 = accountField.getText();
				char[] ps1 = passwordField.getPassword();
				if(user.equals(user1)&&Arrays.equals(ps, ps1)){
					JOptionPane.showMessageDialog(null, "登入成功");
				}else{
					JOptionPane.showMessageDialog(null, "用户名或密码错误！");
					accountField.setText("");
					passwordField.setText("");
				}
			}
		});
		p2.add(enterBtn);
		contentPane.add(p2,BorderLayout.SOUTH);
		setVisible(true);
		
	}
}
