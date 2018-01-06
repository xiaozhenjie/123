package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo3 {

	public static void main(String[] args) {
		new Window2();

	}

}
class Window2{
	public Window2(){
		JFrame w = new JFrame("这是一个窗口");
		w.setBounds(200,200,300,300);
		//容器
		Container contentPane = w.getContentPane();
		/* FlowLayout.CENTER 1
		 * FlowLayout.LEFT   0
		 * FlowLayout.RIGHT  2
		 * FlowLayout.LEADING 左  3
		 * FlowLayout.TRAILING  右 4
		 * */
		/*
		 * new FlowLayout() 跟3个参数
		 * new BorderLayout() 跟2个参数
		 * */
		contentPane.setLayout(new BorderLayout(20,50));
		
		//按钮
		JButton b1 = new JButton("按钮1");
		contentPane.add(b1,BorderLayout.NORTH);
		//设置按钮名称
		b1.setText("1");
		JButton b2 = new JButton("按钮2");
		contentPane.add(b2,BorderLayout.SOUTH);
		JButton b3 = new JButton("按钮3");
		contentPane.add(b3,BorderLayout.WEST);
		JButton b4 = new JButton("按钮4");
		contentPane.add(b4,BorderLayout.EAST);
		w.setVisible(true);
	}
}
