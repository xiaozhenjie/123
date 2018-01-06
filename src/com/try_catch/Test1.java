package com.try_catch;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int x,y;
		
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("请输入一个整数");
			x=sc.nextInt();
			y=sc.nextInt();
			x/=y;
			
		}catch(ArithmeticException e){
			System.out.println("抛出算数异常");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally{
			x=999;
		}
		System.out.println("x="+x);
		
	}

}
//System.err.println("xxx");打印红色的字
