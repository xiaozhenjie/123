package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class �˵���2 {

	public static void main(String[] args) {
		new JMenuBarDimo2("����");

	}

}
class JMenuBarDimo2 extends JFrame implements ActionListener{
	private JMenuBar menuBar;
	private JMenu sysMenu,sMenu,cMenu,scMenu,tMenu;
	//ѧԺ��רҵ���޸����룬�˳�
	private JMenuItem dItem,mItem,pwdItem,exitItem;
	public JMenuBarDimo2(String accound){
		setTitle("ѧ����Ϣ����ϵͳ����ǰ������Ϊ��"+accound);
		setSize(800,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//���������ر�
		//���ò˵���
		menuBar = new JMenuBar();
		//���ò˵�
		
		sysMenu = new JMenu("ϵͳ����");
		sMenu = new JMenu("ѧ����Ϣ����");
		cMenu = new JMenu("�γ���Ϣ����");
		scMenu = new JMenu("�ɼ�����");
		tMenu = new JMenu("��ʦ��Ϣ����");
		//����ϵͳ����˵�������ѡ��
		dItem = new JMenuItem("ѧԺ����");
		mItem = new JMenuItem("רҵ����");
		pwdItem = new JMenuItem("�޸�����");
		exitItem = new JMenuItem("�˳�");
		exitItem.addActionListener(this);
		exitItem.setMnemonic('Q');
		//��Ӳ˵�����ѡ��
		sysMenu.add(dItem);
		sysMenu.add(mItem);
		sysMenu.addSeparator();
		sysMenu.add(pwdItem);
		sysMenu.addSeparator();
		sysMenu.add(exitItem);
		//��Ӳ˵�
		menuBar.add(sysMenu);
		menuBar.add(sMenu);
		menuBar.add(cMenu);
		menuBar.add(scMenu);
		menuBar.add(tMenu);
		//��Ӳ˵���
		this.setJMenuBar(menuBar);
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//if?
		if(e.getSource()==exitItem){
			System.exit(0);
		}
		
	}
	
}