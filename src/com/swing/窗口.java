package com.swing;

import java.awt.*;

import javax.swing.*;

public class ���� {

	public static void main(String[] args) {
		MyFrame mf=new MyFrame();

	}

}
class MyFrame extends JFrame{
	public MyFrame(){
		this("ѧ������ϵͳ");
	}
	public MyFrame(String title){
		setTitle(title);//���ô������
		setSize(500,300);//���ô��ڴ�С
		//��Ļ������ʾ
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();//�����Ļ�ı��
		int screenWidth = size.width;
		int screenHeight = size.height;
		int x = (screenWidth - this.getWidth())/2;
		int y = (screenHeight - this.getHeight())/2;
		this.setLocation(x, y);
		//����ͼ�����  �������·��
		Image img = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("cart.png"));
		this.setIconImage(img);//���ô���ͼ��
		//���ùرհ�ť����
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
}
