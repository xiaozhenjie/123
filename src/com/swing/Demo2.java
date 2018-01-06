package com.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo2 {

	public static void main(String[] args) {
		new Window1();

	}

}
class Window1{
	public Window1(){
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
		contentPane.setLayout(new FlowLayout(FlowLayout.LEADING,20,50));
		System.out.println(FlowLayout.TRAILING);
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
		w.setVisible(true);
	}
}
