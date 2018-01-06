package com.try_catch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 1):Exception 定义一个受检查的异常类
 * 2):RuntimeException 定义一个运行时期的异常类
 *
 */

class AsException extends RuntimeException{
	String msg;
	AsException(String age){
		super(age);
		msg = "您的年龄不适合进入本系统！";
	}
	public String toString(){
		return msg;
	}
}
public class MyException{
	public void intage(int age) throws AsException{
		if(age<18){
			AsException mEx = new AsException(""+age);
			throw mEx;
		}
		if(age>=18){
			System.out.print("合理的年龄！");
		}
	}
	public static void main(String[] args) throws IOException {
		int a;
		try{
			BufferedReader buf = null;
			buf = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			System.out.print("请输入你的年龄：");
			str = buf.readLine();
			a = Integer.parseInt(str);
			MyException my = new MyException();
			my.intage(a);
			System.out.print("抛出异常后的代码");
		}catch(AsException mEx){//捕获年龄异常
			System.err.print(mEx.getMessage());
		}catch(NumberFormatException ne){
			System.out.print("输入的数据类型格式不对，请重新输入：");
		}finally{
			System.out.print("请转告所有人，未满18岁者不能进入！ ");
		}

	}

}
