package com.swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Dome1 {

	public static void main(String[] args) {
		new Window();

	}

}
class Window{
	public Window(){
		int height=400;
		int width=400;
		JFrame win = new JFrame();

		/*Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		int x=(size.width-width)/2;
		int y=(size.height-height)/2;
		win.setBounds(x, y, width, height);*/
		win.setSize(width, height);
		win.setLocationRelativeTo(null);
		win.setTitle("这是一个窗口");
		Image img = Toolkit.getDefaultToolkit().getImage("src/images/cart.png");
		win.setIconImage(img);
		win.setVisible(true);
	}
}
