package com.try_catch;

import java.util.Scanner;

public class RegisterDimo {
	//ģ�����ݿ����Ѿ����ڵ��˺�
	private static String names[] = {"����","����","����"};
	//�����жϵ�ǰ�û��Ƿ����
	private static boolean checkUseNamer(String name){
		for(String x:names){
			if(x.equals(name)){
				throw new LogicException("�û��� "+name+" �ѱ�ע�ᣡ");
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("����ע������");
			checkUseNamer(sc.nextLine());
			System.out.println("ע��ɹ���");
		}catch(LogicException e){
			System.out.println("���û�����"+e.getMessage());
		}
	}

}
