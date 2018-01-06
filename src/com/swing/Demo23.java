package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Demo23 {

	public static void main(String[] args) {
		new Window2123123();

	}

}

class Window2123123 extends JFrame{
	public Window2123123(){
		this("����");
	}
	public Window2123123(String title){
		super(title);
		setSize(400,400);
		setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JLabel Lbl = new JLabel("");
		contentPane.add(Lbl, BorderLayout.WEST);
		
		contentPane.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				Lbl.setText("��������ɿ��¼�");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Lbl.setText("������갴���¼�");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				Lbl.setText("��������Ƴ��¼�");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Lbl.setText("������������¼�");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Lbl.setText("��������ɿ��¼�");
				
			}
		});
		
		setVisible(true);
	}
}
