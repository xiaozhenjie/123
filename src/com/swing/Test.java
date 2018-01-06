package com.swing;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		Object[] answer = {"确认","取消"};
		int x=JOptionPane.showOptionDialog(null,"你确定要退出系统吗？","系统退出",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,answer,answer[1]);
		System.out.println(x);
	}

}
