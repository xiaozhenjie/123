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
		contentPane.setLayout(new FlowLayout(FlowLayout.LEADING,20,50));
		System.out.println(FlowLayout.TRAILING);
		//��ť
		JButton b1 = new JButton("��ť1");
		contentPane.add(b1);
		//���ð�ť����
		b1.setText("1");
		JButton b2 = new JButton("��ť2");
		contentPane.add(b2);
		JButton b3 = new JButton("��ť3");
		contentPane.add(b3);
		JButton b4 = new JButton("��ť4");
		contentPane.add(b4);
		w.setVisible(true);
	}
}
