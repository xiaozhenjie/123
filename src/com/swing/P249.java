package com.swing;

import javax.swing.JOptionPane;

public class P249 {

	public static void main(String[] args) {
		//��1��ȷ�϶Ի��� �� ��ȷ��Ҫ�˳�ϵͳ��
		int answer = JOptionPane.showConfirmDialog(null,//�������� 
		"��ȷ��Ҫ�˳���ϵͳ��",//��ʾ��Ϣ
		"ϵͳ�˳���ʾ",//�Ի������
		JOptionPane.YES_NO_CANCEL_OPTION);//��ť���   ����鿴JOptionPane�Ի�����
		if(answer==0){
			System.out.println("��ѡ������");
		}else if(answer==1){
			System.out.println("��ѡ���˷�");
		}else if(answer==2){
			System.out.println("��ѡ����ȡ��");
		}else if(answer==-1){
			System.out.println("������X");
		}
		
		/*
		 * QUESTION_MESSAGE                                        �ʺ�ͼ��                   3
		 * CANCEL_OPTION OK_CANCEL_OPTION  WARNING_MESSAGE         Σ��ͼ��                   2
		 * DEFAULT_OPTION  PLAIN_MESSAGE	CLOSED_OPTION          û��ͼ��                  -1
		 * ERROR_MESSAGE  OK_OPTION  YES_NO_OPTION  YES_OPTION     �������м�һ��X  0
		 * INFORMATION_MESSAGE   NO_OPTION  YES_NO_CANCEL_OPTION   Բ���м��̾��        1
		 */
		//��2����϶Ի���
		Object[] option={"ȷ��","ȡ��"};
		answer = JOptionPane.showOptionDialog(null,"��ȷ��Ҫ�˳���ϵͳ��2","ϵͳ�˳���ʾ2",JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.CANCEL_OPTION,//ͼ������
				null,//ͼ��Ϊnull��ʾΪ�Զ�����ʾͼ�꣬����Ĭ��ͼ��
				option,//ѡ������
				option[1]);//Ĭ��ѡ��
		if(answer==0){
			System.out.println("��ѡ����ȷ��");
		}else if(answer==1){
			System.out.println("��ѡ����ȡ��");
		}else if(answer==-1){
			System.out.println("������X");
		}
		
		
		//��3����Ϣ�Ի���
		JOptionPane.showMessageDialog(null,"ѧ����Ϣ����ϵͳV1.1"
				+ "\n ָ����ʦ���������������¡������\n���ߣ����1���2С�顣"
				+ "\n������ڣ�2017-3-28");
		
		
		//��4������Ի���
		Object[] choices = {"�رռ����","���������","ע��","�л��û�","˯��"};
		String choiceAnswer = (String)JOptionPane.showInputDialog(null,"��ѡ��ػ�ѡ��","�ػ�ѡ��",
				JOptionPane.PLAIN_MESSAGE,
				null,//ͼ��
				choices,//ѡ��
				choices[1]);//Ĭ��ѡ��
		JOptionPane.showMessageDialog(null,"��Ĺػ�ѡ��Ϊ����"+choiceAnswer+"��");
	}

}
