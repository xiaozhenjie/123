package com.swing;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		Object[] answer = {"ȷ��","ȡ��"};
		int x=JOptionPane.showOptionDialog(null,"��ȷ��Ҫ�˳�ϵͳ��","ϵͳ�˳�",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,answer,answer[1]);
		System.out.println(x);
	}

}
