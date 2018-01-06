package com.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class 鼠标移入移出 {

	public static void main(String[] args) {
		new Window_1();

	}

}
class Window_1{
	public Window_1(){
		JFrame w = new JFrame();
		w.setBounds(400,400,400,400);
		Container contentPane = w.getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.addMouseListener(new MouseListener() {
			//鼠标松开
			@Override
			public void mouseReleased(MouseEvent e) {
				contentPane.setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
				
			}
			//鼠标按下
			@Override
			public void mousePressed(MouseEvent e) {
				contentPane.setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
				
			}
			//鼠标移出
			@Override
			public void mouseExited(MouseEvent e) {
				contentPane.setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
				
			}
			//鼠标移入
			@Override
			public void mouseEntered(MouseEvent e) {
				contentPane.setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
				
			}
			//鼠标松开
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
				
			}
		});
		
		
		w.setVisible(true);
	}
	
}