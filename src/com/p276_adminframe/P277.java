package com.p276_adminframe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.Border;

public class P277 extends JFrame implements Runnable{
	private JLabel titleLabel;
	private JLabel centerImgLabel;
	private JLabel dataLabel;
	public P277(String account){
		setTitle("ѧ����Ϣ����ϵͳ ����ǰ����ԱΪ��"+account);
		setSize(500,400);
		setLocationRelativeTo(null);
		titleLabel = new JLabel("��ӭʹ�ñ�ϵͳ");
		centerImgLabel = new JLabel(new ImageIcon(getClass().getResource("../../images/page3_img2.jpg")));
		dataLabel = new JLabel("ʱ��");
		setLayout(null);
//		Border border = BorderFactory.createLineBorder(Color.blue);
		titleLabel.setBounds(0, 0, 95, 30);
		centerImgLabel.setBounds(94, 40, 300, 250);
		dataLabel.setBounds(130, 300, 240, 30);
//		titleLabel.setBorder(border);
		add(titleLabel);
		add(centerImgLabel);
		add(dataLabel);
		setVisible(true);
		Thread thread = new Thread(this);
		thread.start();
	}
	public static void main(String[] args) {
		new P277("Ф���");
	}

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy �� MM �� dd �� HH:mm:ss");
		int x=0;
		int i=1;
		try{
			while(true){
				x+=i;
				if(x == 390||x==0){
					i=-i;
				}
				titleLabel.setBounds(x, 0, 100, 30);
				Date now = new Date();
//				DateFormat mediumDateFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
//				mediumDateFormat.format(now)
				dataLabel.setText("ϵͳʱ�䣺"+sdf.format(now));
				Thread.sleep(10);

				
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}	
	}

}
