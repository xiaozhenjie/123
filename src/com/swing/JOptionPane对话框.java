package com.swing;

import javax.swing.JOptionPane;
/*
 * QUESTION_MESSAGE ����
 * 
 * YES_NO_CANCEL_OPTION   ����ֵ��0�� 1�� 2ȡ��      1
 * INFORMATION_MESSAGE    ����ֵ��0�� 1�� 2ȡ��      1
 * YES_NO_OPTION          ����ֵ��0�� 1��                 0
 * YES_OPTION             ����ֵ��0�� 1��                 0
 * ERROR_MESSAGE          ����ֵ��0�� 1��                 0
 * WARNING_MESSAGE        ����ֵ��0ȷ�� 2ȡ��          2
 * PLAIN_MESSAGE          ����ֵ��0ȷ��                     -1
 * */
public class JOptionPane�Ի��� {

	public static void main(String[] args) {
		int answer = JOptionPane.showConfirmDialog(null,"��ȷ��Ҫ�˳���ϵͳ��?","ϵͳ�˳���ʾ",0);
		System.out.println(answer);
	}

}
