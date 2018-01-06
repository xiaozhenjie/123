package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class 菜单栏2 {

	public static void main(String[] args) {
		new JMenuBarDimo2("张三");

	}

}
class JMenuBarDimo2 extends JFrame implements ActionListener{
	private JMenuBar menuBar;
	private JMenu sysMenu,sMenu,cMenu,scMenu,tMenu;
	//学院，专业，修改密码，退出
	private JMenuItem dItem,mItem,pwdItem,exitItem;
	public JMenuBarDimo2(String accound){
		setTitle("学生信息管理系统，当前负责人为："+accound);
		setSize(800,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//设置正常关闭
		//设置菜单栏
		menuBar = new JMenuBar();
		//设置菜单
		
		sysMenu = new JMenu("系统管理");
		sMenu = new JMenu("学生信息管理");
		cMenu = new JMenu("课程信息管理");
		scMenu = new JMenu("成绩管理");
		tMenu = new JMenu("教师信息管理");
		//设置系统管理菜单的下拉选项
		dItem = new JMenuItem("学院设置");
		mItem = new JMenuItem("专业设置");
		pwdItem = new JMenuItem("修改密码");
		exitItem = new JMenuItem("退出");
		exitItem.addActionListener(this);
		exitItem.setMnemonic('Q');
		//添加菜单下拉选项
		sysMenu.add(dItem);
		sysMenu.add(mItem);
		sysMenu.addSeparator();
		sysMenu.add(pwdItem);
		sysMenu.addSeparator();
		sysMenu.add(exitItem);
		//添加菜单
		menuBar.add(sysMenu);
		menuBar.add(sMenu);
		menuBar.add(cMenu);
		menuBar.add(scMenu);
		menuBar.add(tMenu);
		//添加菜单栏
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