package com.try_catch_P242;
class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}
public class ��Ŀ8_3 {

	public static void main(String[] args) {
		try{
			MyException mx = new MyException("�Զ����쳣");
			throw mx;
		}catch(MyException e){
			System.out.println(e.getMessage());
		}

	}

}
