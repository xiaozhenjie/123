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
		JFrame w = new JFrame("����һ������");
		w.setBounds(300,300,800,300);
		//����
		Container contentPane = w.getContentPane();
		/* FlowLayout.CENTER 1
		 * FlowLayout.LEFT   0
		 * FlowLayout.RIGHT  2
		 * FlowLayout.LEADING ��  3
		 * FlowLayout.TRAILING  �� 4
		 * */
		/*
		 * new FlowLayout(FlowLayout.CENTER,20,40) ��3������
		 * new BorderLayout(20,40) ��2������
		 * GridLayout(4, 1,20,40) ����ʽ���� ��4������
		 * */
		contentPane.setLayout(new GridLayout(3, 2,20,40));
		
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
		
		JLabel jl = new JLabel("������");
		contentPane.add(jl);
		
		w.setVisible(true);
	}
}