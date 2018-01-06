package com.try_catch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 1):Exception ����һ���ܼ����쳣��
 * 2):RuntimeException ����һ������ʱ�ڵ��쳣��
 *
 */

class AsException extends RuntimeException{
	String msg;
	AsException(String age){
		super(age);
		msg = "�������䲻�ʺϽ��뱾ϵͳ��";
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
			System.out.print("��������䣡");
		}
	}
	public static void main(String[] args) throws IOException {
		int a;
		try{
			BufferedReader buf = null;
			buf = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			System.out.print("������������䣺");
			str = buf.readLine();
			a = Integer.parseInt(str);
			MyException my = new MyException();
			my.intage(a);
			System.out.print("�׳��쳣��Ĵ���");
		}catch(AsException mEx){//���������쳣
			System.err.print(mEx.getMessage());
		}catch(NumberFormatException ne){
			System.out.print("������������͸�ʽ���ԣ����������룺");
		}finally{
			System.out.print("��ת�������ˣ�δ��18���߲��ܽ��룡 ");
		}

	}

}
