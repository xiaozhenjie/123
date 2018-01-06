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
		this("窗口");
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
				Lbl.setText("发生鼠标松开事件");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Lbl.setText("发生鼠标按下事件");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				Lbl.setText("发生鼠标移出事件");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Lbl.setText("发生鼠标移入事件");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Lbl.setText("发生鼠标松开事件");
				
			}
		});
		
		setVisible(true);
	}
}
