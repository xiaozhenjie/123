package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class �齱 {

	public static void main(String[] args) {
		new Window_0("���˴�齱");

	}

}
class Window_0 extends JFrame{
	public Window_0(String title){
		super(title);
		setSize(310,318);
		this.setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());

		JLabel Lbl = new JLabel("",JLabel.CENTER);
		Lbl.setIcon(new ImageIcon(this.getClass().getResource("../../images/page3_img2.jpg")));
		JButton Btn = new JButton("��ʼ");
		Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] stu = {"������","��־��","����","����","���ĺ�","Ф���"};
				Random ran = new Random();
				int num=ran.nextInt(6);
				JOptionPane.showMessageDialog(null, "��"+stu[num]+"�ش����⣡");
			}
		});
		contentPane.add(Lbl,BorderLayout.CENTER);
		contentPane.add(Btn,BorderLayout.SOUTH);
		setVisible(true);
	}
}