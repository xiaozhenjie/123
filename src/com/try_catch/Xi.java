package com.try_catch;

public class Xi {

	public static void main(String[] args) {
		try{
			int i = 0;
			int j = 5;
			System.out.println(j/=i);
		}catch(ArithmeticException e){
			System.out.println("�����˳���Ϊ0���쳣");
		}
		{
			System.out.println("��׽����һ���쳣");
		}
	}

}
