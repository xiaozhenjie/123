package com.try_cacth_java7;

import java.util.Scanner;
//java7:2):try-catch�������쳣
public class CatchDimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("������2����");
			int num1 = Integer.parseInt(sc.nextLine());
			int num2 = Integer.parseInt(sc.nextLine());
			int num3 = num1/num2;
			System.out.println(num3);
		}catch(final ArithmeticException | NumberFormatException e){
			e.printStackTrace();
//			e = new ArithmeticException(); java7 ����Ϊfinal �������¸�ֵ
		}catch(Exception e){
			System.out.println("�����쳣");
		}

	}

}
