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
		JFrame w = new JFrame("����һ������");
		w.setBounds(200,200,300,300);
		//����
		Container contentPane = w.getContentPane();
		/* FlowLayout.CENTER 1
		 * FlowLayout.LEFT   0
		 * FlowLayout.RIGHT  2
		 * FlowLayout.LEADING ��  3
		 * FlowLayout.TRAILING  �� 4
		 * */
		/*
		 * new FlowLayout() ��3������
		 * new BorderLayout() ��2������
		 * */
		contentPane.setLayout(new BorderLayout(20,50));
		
		//��ť
		JButton b1 = new JButton("��ť1");
		contentPane.add(b1,BorderLayout.NORTH);
		//���ð�ť����
		b1.setText("1");
		JButton b2 = new JButton("��ť2");
		contentPane.add(b2,BorderLayout.SOUTH);
		JButton b3 = new JButton("��ť3");
		contentPane.add(b3,BorderLayout.WEST);
		JButton b4 = new JButton("��ť4");
		contentPane.add(b4,BorderLayout.EAST);
		w.setVisible(true);
	}
}
