package com.p274_flashwindow;

import javax.swing.*;


public class FlashWindow extends JWindow{
	//���������  ����������Сֵ�����ֵ�Ľ�����
	JProgressBar progressBar = new JProgressBar(1,100);
	//���캯��
	public FlashWindow(){
		//����ͼƬ
		JLabel backImg = new JLabel(new ImageIcon(getClass().getResource("../../images/page3_img2.jpg")));
		progressBar.setStringPainted(true);//���ý�������ʾ�ı�
		progressBar.setString("ϵͳ���ڱ���ʼ��������");//���ý�������ʾ���ı�
		this.add(backImg,"Center");//JWindowĬ��ΪBorderLayout����
		this.add(progressBar,"South");
		this.toFront();//ʹ�����Ƶ���ǰ��
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
