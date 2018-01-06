package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class Demosss {

	public static void main(String[] args) {
		new Window_2();

	}

}
class Window_2{
	public Window_2(){
		JFrame w = new JFrame();
		w.setBounds(400,400,400,400);
		Container contentPane = w.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		
		w.setVisible(true);
	}
}