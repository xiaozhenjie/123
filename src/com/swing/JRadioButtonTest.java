package com.swing;
import javax.swing.*;
import java.awt.*;
public class JRadioButtonTest {

	public static void main(String[] args) {
		new Window1234("hh");

	}

}
class Window1234 extends JFrame{
	Window1234(String title){
		super(title);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(3,1));
		
		JPanel p[] = {new JPanel(),new JPanel(new BorderLayout()),new JPanel(new BorderLayout())};
		for(JPanel x:p){
			x.setBackground(Color.red);
			contentPane.add(x,BorderLayout.SOUTH);
		}
		
		this.setVisible(true);
	
		
		
	}
	
}