package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class �˵��� {

	public static void main(String[] args) {
		
		new JMenuBarDimo("����");

	}

}
class JMenuBarDimo extends JFrame implements ActionListener{
	//����˵�����
	private JMenuBar menuBar;
	//�˵���ϵͳ����ѧԺ����רҵ����ѧ�������γ̹����ɼ�������ʦ����
	private JMenu sysMenu,sMenu,cMenu,scMenu,tMenu;
	//�˵��ϵͳ����--ѧԺ���ã�רҵ���ã������޸ģ��˳�
	private JMenuItem dItem,mItem,pwdItem,exitItem;
	//�����˵���
	public JMenuBarDimo(String account){
		setTitle("ѧ����Ϣ����ϵͳ����ǰ����ԱΪ��"+account);
		setSize(800,400);
		//���þ�����ʾ
		setLocationRelativeTo(null);
		//���������ر�
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//��Ӳ˵�
		createMenu();
		setVisible(true);
	}
	private void createMenu() {
		menuBar = new JMenuBar();//�����˵���
		//ϵͳ����˵����˵���Ĵ���
		sysMenu = new JMenu("ϵͳ����");
		
		dItem = new JMenuItem("ѧԺ����");
		mItem = new JMenuItem("רҵ����");
		pwdItem = new JMenuItem("�����޸�");
		exitItem = new JMenuItem("�˳�");
		exitItem.addActionListener(this);
		exitItem.setMnemonic('Q');
		sysMenu.add(dItem);
		sysMenu.add(mItem);
		sysMenu.addSeparator();//���һ���ָ���
		sysMenu.add(pwdItem);
		sysMenu.addSeparator();//���һ���ָ���
		sysMenu.add(exitItem);
		//�����˵����˵���Ĵ���
		sMenu = new JMenu("ѧ����Ϣ����");
		cMenu = new JMenu("�γ���Ϣ����");
		tMenu = new JMenu("��ʦ��Ϣ����");
		scMenu = new JMenu("�ɼ�����");
		menuBar.add(sysMenu);
		menuBar.add(sMenu);
		menuBar.add(cMenu);
		menuBar.add(scMenu);
		menuBar.add(tMenu);
		this.setJMenuBar(menuBar);//�Ѳ˵���ӵ�������
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exitItem){
			System.exit(1);
		}
	}
	
}