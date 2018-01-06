package com.swing;

import javax.swing.JOptionPane;
/*
 * QUESTION_MESSAGE 报错
 * 
 * YES_NO_CANCEL_OPTION   返回值：0是 1否 2取消      1
 * INFORMATION_MESSAGE    返回值：0是 1否 2取消      1
 * YES_NO_OPTION          返回值：0是 1否                 0
 * YES_OPTION             返回值：0是 1否                 0
 * ERROR_MESSAGE          返回值：0是 1否                 0
 * WARNING_MESSAGE        返回值：0确认 2取消          2
 * PLAIN_MESSAGE          返回值：0确认                     -1
 * */
public class JOptionPane对话框 {

	public static void main(String[] args) {
		int answer = JOptionPane.showConfirmDialog(null,"你确定要退出本系统吗?","系统退出提示",0);
		System.out.println(answer);
	}

}
