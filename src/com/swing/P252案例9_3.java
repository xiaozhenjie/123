package com.swing;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class P252����9_3 extends JFrame{
	private JLabel accountLbl,passwordLbl,roleLbl;
	private JTextField accountField;
	private JPasswordField passwordField;
	private JButton enterBtn,exitBtn;
	private JComboBox roleCombox;
	
	public P252����9_3(String title){
		//-----------��1����������----------------
		setTitle(title);//���ô������
		setSize(280,170);//���ô����С
		this.setLocationRelativeTo(null);//������ʾ
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//�����رմ���
		setResizable(false);//���ô����С���ɱ�
		
		//-------------��2����������Ԫ��---------------
		accountLbl = new JLabel("�û��˺ţ�");//����һ��Label������ʾ�û��˺�
		passwordLbl = new JLabel("�û����룺");//����һ��Label������ʾ�û�����
		roleLbl = new JLabel("�û���ݣ�");//����һ��Label������ʾ�û����
		accountField = new JTextField(20);//����JTextField����������ʾ����Ϊ20��
		passwordField = new JPasswordField(20);//����JPasswordField����������ʾ����Ϊ20��
		enterBtn = new JButton("��¼");//����һ����ʾ�ı�Ϊ��¼��JButton����
		exitBtn =new JButton("�˳�");//����һ����ʾ�ı�Ϊ�˳���JButton����
		//����һ����ʾ����Ϊ����Ա��ѧ������ʦ����Ͽ�
		roleCombox = new JComboBox(new String[] {"����Ա","ѧ��","��ʦ"});
		setLayout(null);//���ò���Ϊ�ղ���
		accountLbl.setBounds(30,10,60,20);
		passwordLbl.setBounds(30,40,60,20);
		roleLbl.setBounds(30,70,60,20);
		accountField.setBounds(90,10,150,20);
		passwordField.setBounds(90,40,150,20);
		roleCombox.setBounds(90,70,150,20);
		enterBtn.setBounds(30,100,100,20);
		exitBtn.setBounds(140,100,100,20);
		//�����������ӵ����㴰����
		add(accountLbl);
		add(passwordLbl);
		add(accountField);
		add(passwordField);
		add(roleLbl);
		add(roleCombox);
		add(enterBtn);
		add(exitBtn);
		setVisible(true);//��ʾ����
		
	}
	
	public static void main(String[] args) {
		new P252����9_3("ѧ����Ϣ����ϵͳ-��¼ϵͳ");

	}

}
