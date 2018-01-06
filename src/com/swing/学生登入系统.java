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

public class ѧ������ϵͳ {

	public static void main(String[] args) {
		new Window_a("ѧ����Ϣ����ϵͳ");
		
	}

}
class Window_a extends JFrame{
	public Window_a(){
		this("Ĭ�ϴ���");
	}
	public Window_a(String title){
		super(title);
		setSize(400,400);
		setLocationRelativeTo(null);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		//����
		JLabel lb = new JLabel("ѧ����Ϣ¼��ϵͳ",JLabel.CENTER);
		lb.setForeground(Color.blue);
		lb.setFont(new Font("����", Font.BOLD, 18));
		contentPane.add(lb,BorderLayout.NORTH);
		//�в�
		JPanel p1 = new JPanel();
		Border border0 = BorderFactory.createLineBorder(Color.blue);
		Border border = BorderFactory.createTitledBorder(border0,"������ѧ����Ϣ");
		p1.setBorder(border);
		
		Box vtemp1 = Box.createVerticalBox();
		Box htemp1 = Box.createHorizontalBox();
		Box htemp2 = Box.createHorizontalBox();
		Box htemp3 = Box.createHorizontalBox();
		Box htemp4 = Box.createHorizontalBox();
		Box htemp5 = Box.createHorizontalBox();
		//����
		JLabel label_name = new JLabel("������");
		JTextField field_name = new JTextField(20);
		htemp1.add(label_name);
		htemp1.add(Box.createHorizontalStrut(20));
		htemp1.add(field_name);
		//����
		JLabel label_ps = new JLabel("���룺");
		JPasswordField field_ps = new JPasswordField(20);
		htemp2.add(label_ps);
		htemp2.add(Box.createHorizontalStrut(20));
		htemp2.add(field_ps);
		//�Ա�
		JLabel label_sex = new JLabel("�Ա�");
		JRadioButton man = new JRadioButton("��");
		JRadioButton woman = new JRadioButton("Ů");
		ButtonGroup sex = new ButtonGroup();
		sex.add(man);
		sex.add(woman);
		htemp3.add(label_sex);
		htemp3.add(man);
		htemp3.add(Box.createHorizontalStrut(10));
		htemp3.add(woman);
		htemp3.add(Box.createHorizontalStrut(20));
		//����
		JCheckBox dy = new JCheckBox("����");
		htemp3.add(dy);
		htemp3.add(Box.createHorizontalStrut(20));
		//����
		JLabel label_age = new JLabel("���䣺");
		htemp3.add(label_age);
		JSpinner js = new JSpinner();
		js.setValue(20);
		htemp3.add(js);
		//ϵ��
		Object[] xb = {"��Ϣ����ѧԺ","��е����ѧԺ"};
		JLabel label_xb = new JLabel("ϵ��:");
		JComboBox comboBox = new JComboBox(xb);
		htemp4.add(label_xb);
		htemp4.add(Box.createHorizontalStrut(20));
		htemp4.add(comboBox);
		//��ť
		JButton enterBtn = new JButton("ȷ��");
		JButton exitBtn = new JButton("ȡ��");
		enterBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = field_name.getText();
				String ps = new String(field_ps.getPassword());
				String sex = "";
				if(man.isSelected()){
					sex = "��";
				}
				if(woman.isSelected()){
					sex = "Ů";
				}
				String danyuan=dy.isSelected()?"��Ա":"���ǵ�Ա";
				String xibei = comboBox.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null, "������"+name+"�����룺"+ps+"���Ա�"+sex+","+danyuan+"�����䣺"+js.getValue()+"������Ժϵ��"+xibei);
				
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
		//�ϲ�
		JPanel p2 = new JPanel(new BorderLayout());
		JLabel label_bq = new JLabel("��Ȩ���У�xxx");
		Calendar timer = Calendar.getInstance();
		
		JLabel label_timer = new JLabel("����ʱ���ǣ�"+timer.get(Calendar.YEAR)+"��"
				+(timer.get(Calendar.MONTH)+1)+"��"
				+timer.get(Calendar.DATE)+"��"
				+timer.get(Calendar.HOUR)+"ʱ"
				+timer.get(Calendar.MINUTE)+"��"
				+timer.get(Calendar.SECOND)+"��");
		p2.add(label_bq,BorderLayout.WEST);
		p2.add(label_timer,BorderLayout.EAST);
		contentPane.add(p2,BorderLayout.SOUTH);
		setVisible(true);
	}
}
