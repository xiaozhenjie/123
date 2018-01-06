package com.try_catch;

public class Xi {

	public static void main(String[] args) {
		try{
			int i = 0;
			int j = 5;
			System.out.println(j/=i);
		}catch(ArithmeticException e){
			System.out.println("捕获到了除数为0的异常");
		}
		{
			System.out.println("捕捉到了一个异常");
		}
	}

}
