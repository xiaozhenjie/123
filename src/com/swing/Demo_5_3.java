package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo_5_3 {

	public static void main(String[] args) {
		new MyFrame1();
	}
}
class MyFrame1 extends JFrame{
	private JLabel label = new JLabel("请输入你的姓名：");
	private JTextField text_name = new JTextField(10);
	private JButton bt = new JButton("按下");
	private JTextArea text_area = new JTextArea(2,20);
	private JPanel p1 = new JPanel();
	public MyFrame1(){
		this.setTitle("我的窗口");
		this.setBounds(100, 200, 300, 300);
		initialize();
		this.setVisible(true);
		
	}
	public void initialize(){
		p1.add(label);
		p1.add(text_name);
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text_area.setText(text_name.getText()+"你好！");
			}
		});
		p1.add(bt);
		p1.add(text_area);
		this.add(p1);
	}
}
