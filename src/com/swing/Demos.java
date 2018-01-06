package com.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Demos {

	public static void main(String[] args) {
		new Window132();

	}

}
class Window132{
	public Window132(){
		JFrame w = new JFrame();
		w.setBounds(400,400,300,300);
		Container contentPane = w.getContentPane();
		contentPane.setLayout(new BorderLayout());
		JLabel lb = new JLabel("û�а�ť������",JLabel.CENTER);
		contentPane.add(lb, BorderLayout.NORTH);
		
		JPanel p1 = new JPanel();
		contentPane.add(p1, BorderLayout.SOUTH);
		
		JButton redBtn = new JButton("red");
		p1.add(redBtn, BorderLayout.SOUTH);
		redBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.red);
				p1.setBackground(Color.red);
				lb.setText("��߰�ť������");
				
			}
		});
		JButton blueBtn = new JButton("blue");
		p1.add(blueBtn,BorderLayout.SOUTH);
		blueBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.blue);
				p1.setBackground(Color.blue);
				lb.setText("�м䰴ť������");
			}
		});
		
		JButton yellowBtn = new JButton("yellow");
		p1.add(yellowBtn,BorderLayout.SOUTH);
		yellowBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.yellow);
				p1.setBackground(Color.yellow);
				lb.setText("�ұ߰�ť������");
				
			}
		});
		w.setVisible(true);
	}
	
}