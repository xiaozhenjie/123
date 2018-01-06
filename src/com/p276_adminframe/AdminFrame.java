package com.p276_adminframe;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class AdminFrame extends JFrame implements Runnable{
	private JPanel statusBar;
	private JLabel datatimeLabel;//ʱ��
	public AdminFrame(String account){
		JLabel backImg = new JLabel(new ImageIcon(getClass().getResource("../../images/page3_img2.jpg")));
		this.add(backImg,"Center");
		setTitle("ѧ����Ϣ����ϵͳ����ǰ����ԱΪ��"+account);
		setSize(790,452);
		//��Ļ������ʾ
		setLocationRelativeTo(null);
		//�����رմ���
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//����ʱ�����
		createStatusBar();
		//��ʾ����
		setVisible(true);
		//�����̶߳����߳���Ϊ��ǰ���run��������
		Thread thread = new Thread(this);
		//�����߳�
		thread.start();
	}

	public static void main(String[] args) {
		new AdminFrame("Ф���");
		
	}

	@Override
	public void run() {
		try {
			while(true){
				Date now = new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy �� MM �� dd �� hh:mm:ss");
				datatimeLabel.setText("����ʱ���ǣ�"+sdf.format(now));
				Thread.sleep(1000);
			
			}
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
	private void createStatusBar(){
		statusBar = new JPanel();
		datatimeLabel = new JLabel();
		statusBar.add(datatimeLabel);
		this.add(statusBar,BorderLayout.SOUTH);
		statusBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));//�߿�Ч��
	}
}
