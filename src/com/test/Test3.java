package com.test;

import javax.swing.JFrame;

public class Test3 {

	public static void main(String[] args) {
		new Window3();
	}

}
class Window3 extends JFrame{
	public Window3(){
		this("����һ������");
	}
	public Window3(String title){
		setTitle(title);
	}
}