package com.swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class �����¼� {

	public static void main(String[] args) {
		new test_1("2");

	}

}
class test_1 extends JFrame{
	public test_1(String title){
		super(title);
		setSize(400, 400);
		JLabel lb = new JLabel("����");
		add(lb);
		
		setVisible(true);
		
	}
}