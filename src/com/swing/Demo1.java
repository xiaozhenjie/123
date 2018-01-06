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
		new Window_13132("�û��������");

	}

}
class Window_13132 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6729856114430066135L;
	public Window_13132(){
		this("����");
	}
	public Window_13132(String title){
		super(title);
		setSize(300,200);
		setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JLabel Lbl = new JLabel("���û�ע��",JLabel.CENTER);
		contentPane.add(Lbl,BorderLayout.NORTH);
		
		JPanel p1 = new JPanel(new GridLayout(3,2));
		JLabel accountLbl = new JLabel("�û�����",JLabel.CENTER);
		JTextField accountField = new JTextField(10);
		JLabel passwordLbl = new JLabel("���룺",JLabel.CENTER);
		JPasswordField passwordField = new JPasswordField(10);
		JLabel ispasswordLbl = new JLabel("ȷ�����룺",JLabel.CENTER);
		JPasswordField ispasswordField = new JPasswordField(10);
		
		p1.add(accountLbl);
		p1.add(accountField);
		p1.add(passwordLbl);
		p1.add(passwordField);
		p1.add(ispasswordLbl);
		p1.add(ispasswordField);
		
		contentPane.add(p1, BorderLayout.CENTER);
		
		JPanel p2 = new JPanel();
		JButton btn = new JButton("�ύ");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				char[] ps = passwordField.getPassword();
				char[] isps = ispasswordField.getPassword();
				if(Arrays.equals(ps, isps)){
					JOptionPane.showMessageDialog(null,accountField.getText()+"ע��ɹ���");

					new Window_ads("��¼",accountField.getText(),ps);
					
					
				}else{
					JOptionPane.showMessageDialog(null, "�����������벻һ��");
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
		
		JLabel Lbl = new JLabel("�û�����ҳ��",JLabel.CENTER);
		contentPane.add(Lbl,BorderLayout.NORTH);
		
		JPanel p1 = new JPanel(new GridLayout(2,2));
		JLabel accountLbl = new JLabel("�û�����",JLabel.CENTER);
		JTextField accountField = new JTextField(10);
		JLabel passwordLbl = new JLabel("���룺",JLabel.CENTER);
		JPasswordField passwordField = new JPasswordField(10);
		
		p1.add(accountLbl);
		p1.add(accountField);
		p1.add(passwordLbl);
		p1.add(passwordField);
		
		contentPane.add(p1, BorderLayout.CENTER);
		
		JPanel p2 = new JPanel();
		JButton enterBtn = new JButton("��¼");
		enterBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user1 = accountField.getText();
				char[] ps1 = passwordField.getPassword();
				if(user.equals(user1)&&Arrays.equals(ps, ps1)){
					JOptionPane.showMessageDialog(null, "����ɹ�");
				}else{
					JOptionPane.showMessageDialog(null, "�û������������");
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
