package com.p276_adminframe;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class AdminFrame extends JFrame implements Runnable{
	private JPanel statusBar;
	private JLabel datatimeLabel;//时间
	public AdminFrame(String account){
		JLabel backImg = new JLabel(new ImageIcon(getClass().getResource("../../images/page3_img2.jpg")));
		this.add(backImg,"Center");
		setTitle("学生信息管理系统，当前管理员为："+account);
		setSize(790,452);
		//屏幕居中显示
		setLocationRelativeTo(null);
		//正常关闭窗口
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//设置时间出现
		createStatusBar();
		//显示窗体
		setVisible(true);
		//创建线程对象，线程体为当前类的run（）方法
		Thread thread = new Thread(this);
		//启动线程
		thread.start();
	}

	public static void main(String[] args) {
		new AdminFrame("肖振杰");
		
	}

	@Override
	public void run() {
		try {
			while(true){
				Date now = new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy 年 MM 月 dd 日 hh:mm:ss");
				datatimeLabel.setText("现在时间是："+sdf.format(now));
				Thread.sleep(1000);
			
			}
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	private void createStatusBar(){
		statusBar = new JPanel();
		datatimeLabel = new JLabel();
		statusBar.add(datatimeLabel);
		this.add(statusBar,BorderLayout.SOUTH);
		statusBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));//边框效果
	}
}
