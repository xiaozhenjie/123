package com.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class 学生登入系统 {

	public static void main(String[] args) {
		new Window_a("学生信息登入系统");
		
	}

}
class Window_a extends JFrame{
	public Window_a(){
		this("默认窗口");
	}
	public Window_a(String title){
		super(title);
		setSize(400,400);
		setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		//北部
		JLabel lb = new JLabel("学生信息录入系统",JLabel.CENTER);
		lb.setForeground(Color.blue);
		lb.setFont(new Font("黑体", Font.BOLD, 18));
		contentPane.add(lb,BorderLayout.NORTH);
		//中部
		JPanel p1 = new JPanel();
		Border border0 = BorderFactory.createLineBorder(Color.blue);
		Border border = BorderFactory.createTitledBorder(border0,"请输入学生信息");
		p1.setBorder(border);
		
		Box vtemp1 = Box.createVerticalBox();
		Box htemp1 = Box.createHorizontalBox();
		Box htemp2 = Box.createHorizontalBox();
		Box htemp3 = Box.createHorizontalBox();
		Box htemp4 = Box.createHorizontalBox();
		Box htemp5 = Box.createHorizontalBox();
		//姓名
		JLabel label_name = new JLabel("姓名：");
		JTextField field_name = new JTextField(20);
		htemp1.add(label_name);
		htemp1.add(Box.createHorizontalStrut(20));
		htemp1.add(field_name);
		//密码
		JLabel label_ps = new JLabel("密码：");
		JPasswordField field_ps = new JPasswordField(20);
		htemp2.add(label_ps);
		htemp2.add(Box.createHorizontalStrut(20));
		htemp2.add(field_ps);
		//性别
		JLabel label_sex = new JLabel("性别：");
		JRadioButton man = new JRadioButton("男");
		JRadioButton woman = new JRadioButton("女");
		ButtonGroup sex = new ButtonGroup();
		sex.add(man);
		sex.add(woman);
		htemp3.add(label_sex);
		htemp3.add(man);
		htemp3.add(Box.createHorizontalStrut(10));
		htemp3.add(woman);
		htemp3.add(Box.createHorizontalStrut(20));
		//党否
		JCheckBox dy = new JCheckBox("党否");
		htemp3.add(dy);
		htemp3.add(Box.createHorizontalStrut(20));
		//年龄
		JLabel label_age = new JLabel("年龄：");
		htemp3.add(label_age);
		JSpinner js = new JSpinner();
		js.setValue(20);
		htemp3.add(js);
		//系别
		Object[] xb = {"信息工程学院","机械工程学院"};
		JLabel label_xb = new JLabel("系别:");
		JComboBox comboBox = new JComboBox(xb);
		htemp4.add(label_xb);
		htemp4.add(Box.createHorizontalStrut(20));
		htemp4.add(comboBox);
		//按钮
		JButton enterBtn = new JButton("确定");
		JButton exitBtn = new JButton("取消");
		enterBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = field_name.getText();
				String ps = new String(field_ps.getPassword());
				String sex = "";
				if(man.isSelected()){
					sex = "男";
				}
				if(woman.isSelected()){
					sex = "女";
				}
				String danyuan=dy.isSelected()?"党员":"不是党员";
				String xibei = comboBox.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null, "姓名："+name+"，密码："+ps+"，性别："+sex+","+danyuan+"，年龄："+js.getValue()+"，所在院系："+xibei);
				
			}
		});
		
		htemp5.add(enterBtn);
		htemp5.add(Box.createHorizontalStrut(20));
		htemp5.add(exitBtn);
		
		vtemp1.add(htemp1);
		vtemp1.add(Box.createVerticalStrut(20));
		vtemp1.add(htemp2);
		vtemp1.add(Box.createVerticalStrut(20));
		vtemp1.add(htemp3);
		vtemp1.add(Box.createVerticalStrut(20));
		vtemp1.add(htemp4);
		vtemp1.add(Box.createVerticalStrut(20));
		vtemp1.add(htemp5);
		vtemp1.add(Box.createVerticalStrut(20));
		p1.add(vtemp1);
		contentPane.add(p1, BorderLayout.CENTER);
		//南部
		JPanel p2 = new JPanel(new BorderLayout());
		JLabel label_bq = new JLabel("版权所有：xxx");
		Calendar timer = Calendar.getInstance();
		
		JLabel label_timer = new JLabel("现在时间是："+timer.get(Calendar.YEAR)+"年"
				+(timer.get(Calendar.MONTH)+1)+"月"
				+timer.get(Calendar.DATE)+"日"
				+timer.get(Calendar.HOUR)+"时"
				+timer.get(Calendar.MINUTE)+"分"
				+timer.get(Calendar.SECOND)+"秒");
		p2.add(label_bq,BorderLayout.WEST);
		p2.add(label_timer,BorderLayout.EAST);
		contentPane.add(p2,BorderLayout.SOUTH);
		setVisible(true);
	}
}
