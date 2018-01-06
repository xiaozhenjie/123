package com.test;

import javax.swing.JFrame;

public class Test5 {

	public static void main(String[] args) {
		new Window5();

	}

}
class Window5 extends JFrame{
	public Window5(){
		this("这是一个窗口");
	}
	public Window5(String title){
		setTitle(title);
	}
}