package com.swing;

import javax.swing.JOptionPane;

public class Test2 {

	public static void main(String[] args) {
		Object[] answer = {"确认","取消","帮助"};
		int x = JOptionPane.showOptionDialog(null, "你确定要退出系统吗？", "系统退出", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answer, answer[1]);
		if(x==JOptionPane.YES_OPTION){
			Object[] choices = {"关闭计算机","重启计算机","注销","切换用户","睡眠"};
			String choiceAnswer = (String)JOptionPane.showInputDialog(null,"系统关机选项","系统关机",JOptionPane.PLAIN_MESSAGE,null,choices,choices[1]);
			System.out.println("你点击了【"+choiceAnswer+"】选项");
		}else if(x==2){
			JOptionPane.showMessageDialog(null, "这是一个帮助提示：\n1、哈哈\n2、哈哈哈");
		}
	}

}
