package com.try_catch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException1 extends Exception{
	String str;
	MyException1(int num1,int num2){
		str = "��ֵ������Χ";
	}
	public String toString(){
		return str;
	}
}
public class P241��è���� {
	static void intNum(int num1,int num2) throws MyException1{
		if((num1>255||num1<-255)||(num2<-255||num2>255)){
			MyException1 e = new MyException1(num1,num2);
			throw e;
		}
		if(!((num1>255||num1<-255)||(num2<-255||num2>255))){
			int sum = num1+num2;
			System.out.println(num1+"+"+num2+"="+sum);
		}
		
	}
	public static void main(String[] args) throws IOException{
		int num1,num2;
		try{
			BufferedReader buf = null;
			buf = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			System.out.print("������2������");
			str = buf.readLine();
			num1 = Integer.parseInt(str);
			str = buf.readLine();
			num2 = Integer.parseInt(str);
			intNum(num1,num2);
		}catch(MyException1 e){
			System.out.println(e);
		}catch(NumberFormatException ne){
			System.out.println("������������Ͳ��� �� ����������");
		}finally{
			System.out.println("�������Ҫ��[-255,255]��Χ��");
		}

	}

}
