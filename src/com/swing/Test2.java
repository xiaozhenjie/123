package com.swing;

import javax.swing.JOptionPane;

public class Test2 {

	public static void main(String[] args) {
		Object[] answer = {"ȷ��","ȡ��","����"};
		int x = JOptionPane.showOptionDialog(null, "��ȷ��Ҫ�˳�ϵͳ��", "ϵͳ�˳�", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answer, answer[1]);
		if(x==JOptionPane.YES_OPTION){
			Object[] choices = {"�رռ����","���������","ע��","�л��û�","˯��"};
			String choiceAnswer = (String)JOptionPane.showInputDialog(null,"ϵͳ�ػ�ѡ��","ϵͳ�ػ�",JOptionPane.PLAIN_MESSAGE,null,choices,choices[1]);
			System.out.println("�����ˡ�"+choiceAnswer+"��ѡ��");
		}else if(x==2){
			JOptionPane.showMessageDialog(null, "����һ��������ʾ��\n1������\n2��������");
		}
	}

}
