package com.p274_flashwindow;

import javax.swing.*;


public class FlashWindow extends JWindow{
	//进度条组件  创建具有最小值和最大值的进度条
	JProgressBar progressBar = new JProgressBar(1,100);
	//构造函数
	public FlashWindow(){
		//背景图片
		JLabel backImg = new JLabel(new ImageIcon(getClass().getResource("../../images/page3_img2.jpg")));
		progressBar.setStringPainted(true);//设置进度条显示文本
		progressBar.setString("系统正在被初始化。。。");//设置进度条显示的文本
		this.add(backImg,"Center");//JWindow默认为BorderLayout布局
		this.add(progressBar,"South");
		this.toFront();//使界面移到最前面
		this.setSize(484, 250);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		FlashThread fThread = new FlashThread(this);
		fThread.start();
	}
	public static void main(String[] args) {
		new FlashWindow();
		
	}

}
