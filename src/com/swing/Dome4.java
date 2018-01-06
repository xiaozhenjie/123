package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dome4 {

	public static void main(String[] args) {
		new Window33();

	}
}
class Window33{
	public Window33(){
		JFrame w = new JFrame("这是一个窗口");
		w.setBounds(300,300,800,300);
		//容器
		Container contentPane = w.getContentPane();
		/* FlowLayout.CENTER 1
		 * FlowLayout.LEFT   0
		 * FlowLayout.RIGHT  2
		 * FlowLayout.LEADING 左  3
		 * FlowLayout.TRAILING  右 4
		 * */
		/*
		 * new FlowLayout(FlowLayout.CENTER,20,40) 跟3个参数
		 * new BorderLayout(20,40) 跟2个参数
		 * GridLayout(4, 1,20,40) 网格式布局 跟4个参数
		 * */
		contentPane.setLayout(new GridLayout(3, 2,20,40));
		
		//按钮
		JButton b1 = new JButton("按钮1");
		contentPane.add(b1);
		//设置按钮名称
		b1.setText("1");
		JButton b2 = new JButton("按钮2");
		contentPane.add(b2);
		JButton b3 = new JButton("按钮3");
		contentPane.add(b3);
		JButton b4 = new JButton("按钮4");
		contentPane.add(b4);
		
		JLabel jl = new JLabel("刘建文");
		contentPane.add(jl);
		
		w.setVisible(true);
	}
}