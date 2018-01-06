package com.try_cacth_java7;

import java.util.Scanner;
//java7:2):try-catch捕获多个异常
public class CatchDimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("请输入2个数");
			int num1 = Integer.parseInt(sc.nextLine());
			int num2 = Integer.parseInt(sc.nextLine());
			int num3 = num1/num2;
			System.out.println(num3);
		}catch(final ArithmeticException | NumberFormatException e){
			e.printStackTrace();
//			e = new ArithmeticException(); java7 设置为final 不能重新赋值
		}catch(Exception e){
			System.out.println("其他异常");
		}

	}

}
