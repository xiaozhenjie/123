package com.try_catch;

import java.util.Scanner;

public class RegisterDimo {
	//模拟数据库中已经存在的账号
	private static String names[] = {"张三","李四","王五"};
	//用来判断当前用户是否存在
	private static boolean checkUseNamer(String name){
		for(String x:names){
			if(x.equals(name)){
				throw new LogicException("用户名 "+name+" 已被注册！");
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("输入注册名：");
			checkUseNamer(sc.nextLine());
			System.out.println("注册成功！");
		}catch(LogicException e){
			System.out.println("给用户看："+e.getMessage());
		}
	}

}
