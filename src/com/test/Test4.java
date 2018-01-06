package com.test;

import javax.swing.JFrame;

public class Test4 {

	public static void main(String[] args) {
		new Window4();
	}

}
class Window4 extends JFrame{
	public Window4(){
		this("这是一个窗口");
	}
	public Window4(String title){
		setTitle(title);
	}
}