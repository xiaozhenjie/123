package test1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test {
	public static void main(String[] args) {
		new Record();
	}
}
class Record extends JFrame{
	Record(){
		setTitle("盗号");
		setBounds(100,200,300,200);
		setLayout(new GridLayout(3, 1));
		JPanel p1 = new JPanel();
		JLabel lb_name = new JLabel("用户：");
		JTextField tx_name = new JTextField(10);
		add(p1);
		p1.add(lb_name);
		p1.add(tx_name);
		JPanel p2 = new JPanel();
		JLabel lb_pass = new JLabel("密码：");
		JPasswordField tx_pass = new JPasswordField(10);
		add(p2);
		p2.add(lb_pass);
		p2.add(tx_pass);
		JPanel p3 = new JPanel();
		JButton bt = new JButton("登入");
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tx_name.getText();
				char[] passWold = tx_pass.getPassword();
				if(name.isEmpty()||passWold.length==0){
					JOptionPane.showMessageDialog(null, "用户或密码不能为空");
				}
				String str = "姓名："+name +"密码："+new String(passWold);
				File file = new File("file/123.txt");
				if(!file.isDirectory()){
					try {
						file.createNewFile();
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
				try (
						OutputStream out = new FileOutputStream(file);
						){
					out.write(str.getBytes());
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});
		p3.add(bt);
		add(p3);
		setVisible(true);
	}
}