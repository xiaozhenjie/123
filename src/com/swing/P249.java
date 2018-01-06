package com.swing;

import javax.swing.JOptionPane;

public class P249 {

	public static void main(String[] args) {
		//（1）确认对话框 ： 你确定要退出系统吗？
		int answer = JOptionPane.showConfirmDialog(null,//所属窗体 
		"你确定要退出本系统吗？",//提示信息
		"系统退出提示",//对话框标题
		JOptionPane.YES_NO_CANCEL_OPTION);//按钮类别   详情查看JOptionPane对话框类
		if(answer==0){
			System.out.println("你选择了是");
		}else if(answer==1){
			System.out.println("你选择了否");
		}else if(answer==2){
			System.out.println("你选择了取消");
		}else if(answer==-1){
			System.out.println("你点击了X");
		}
		
		/*
		 * QUESTION_MESSAGE                                        问号图标                   3
		 * CANCEL_OPTION OK_CANCEL_OPTION  WARNING_MESSAGE         危险图标                   2
		 * DEFAULT_OPTION  PLAIN_MESSAGE	CLOSED_OPTION          没有图标                  -1
		 * ERROR_MESSAGE  OK_OPTION  YES_NO_OPTION  YES_OPTION     六边形中间一个X  0
		 * INFORMATION_MESSAGE   NO_OPTION  YES_NO_CANCEL_OPTION   圆形中间感叹号        1
		 */
		//（2）组合对话框
		Object[] option={"确认","取消"};
		answer = JOptionPane.showOptionDialog(null,"你确定要退出本系统吗？2","系统退出提示2",JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.CANCEL_OPTION,//图标类型
				null,//图标为null表示为自定义显示图标，采用默认图标
				option,//选项内容
				option[1]);//默认选项
		if(answer==0){
			System.out.println("你选择了确认");
		}else if(answer==1){
			System.out.println("你选择了取消");
		}else if(answer==-1){
			System.out.println("你点击了X");
		}
		
		
		//（3）消息对话框
		JOptionPane.showMessageDialog(null,"学生信息管理系统V1.1"
				+ "\n 指导老师：张永常、胡局新、康晓凤。\n作者：软件1班第2小组。"
				+ "\n完成日期：2017-3-28");
		
		
		//（4）输入对话框
		Object[] choices = {"关闭计算机","重启计算机","注销","切换用户","睡眠"};
		String choiceAnswer = (String)JOptionPane.showInputDialog(null,"请选择关机选项","关机选项",
				JOptionPane.PLAIN_MESSAGE,
				null,//图标
				choices,//选项
				choices[1]);//默认选项
		JOptionPane.showMessageDialog(null,"你的关机选项为：【"+choiceAnswer+"】");
	}

}
