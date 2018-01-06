package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class 菜单栏 {

	public static void main(String[] args) {
		
		new JMenuBarDimo("张三");

	}

}
class JMenuBarDimo extends JFrame implements ActionListener{
	//定义菜单变量
	private JMenuBar menuBar;
	//菜单：系统管理，学院管理，专业管理，学生管理，课程管理，成绩管理，教师管理
	private JMenu sysMenu,sMenu,cMenu,scMenu,tMenu;
	//菜单项：系统管理--学院设置，专业设置，密码修改，退出
	private JMenuItem dItem,mItem,pwdItem,exitItem;
	//其他菜单略
	public JMenuBarDimo(String account){
		setTitle("学生信息管理系统，当前管理员为："+account);
		setSize(800,400);
		//设置居中显示
		setLocationRelativeTo(null);
		//设置正常关闭
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//添加菜单
		createMenu();
		setVisible(true);
	}
	private void createMenu() {
		menuBar = new JMenuBar();//创建菜单栏
		//系统管理菜单及菜单项的创建
		sysMenu = new JMenu("系统管理");
		
		dItem = new JMenuItem("学院设置");
		mItem = new JMenuItem("专业设置");
		pwdItem = new JMenuItem("密码修改");
		exitItem = new JMenuItem("退出");
		exitItem.addActionListener(this);
		exitItem.setMnemonic('Q');
		sysMenu.add(dItem);
		sysMenu.add(mItem);
		sysMenu.addSeparator();//添加一条分割线
		sysMenu.add(pwdItem);
		sysMenu.addSeparator();//添加一条分割线
		sysMenu.add(exitItem);
		//其他菜单及菜单项的创建
		sMenu = new JMenu("学生信息管理");
		cMenu = new JMenu("课程信息管理");
		tMenu = new JMenu("教师信息管理");
		scMenu = new JMenu("成绩管理");
		menuBar.add(sysMenu);
		menuBar.add(sMenu);
		menuBar.add(cMenu);
		menuBar.add(scMenu);
		menuBar.add(tMenu);
		this.setJMenuBar(menuBar);//把菜单添加到窗体中
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exitItem){
			System.exit(1);
		}
	}
	
}