package com.swing;

import java.awt.*;

import javax.swing.*;

public class 窗口 {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();

	}

}
class MyFrame extends JFrame{
	public MyFrame(){
		this("学生管理系统");
	}
	public MyFrame(String title){
		setTitle(title);//设置窗体标题
		setSize(500,300);//设置窗口大小
		//屏幕居中显示
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();//获得屏幕的标尺
		int screenWidth = size.width;
		int screenHeight = size.height;
		int x = (screenWidth - this.getWidth())/2;
		int y = (screenHeight - this.getHeight())/2;
		this.setLocation(x, y);
		//创建图标对象  必须相对路径
		Image img = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("cart.png"));
		this.setIconImage(img);//设置窗体图标
		//设置关闭按钮操作
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
}
