package com.try_catch;

public class throwDimo {

	public static void main(String[] args) {
		try{
			System.out.print("抛出一个算数异常：");
			throw new ArithmeticException();
		}catch(ArithmeticException ae){
			System.out.println(ae);//异常的对象ae ，捕获并抛出异常ArithmeticException
		}
		try{
			System.out.print("抛出一个数组下标越界异常：");
			throw new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException ai){
			System.out.println(ai);//异常对象ai ，捕获并抛出异常ArrayIndexOutOfBoundsException
		}
		try{
			System.out.print("抛出一个字符数组下标越界异常：");
			throw new StringIndexOutOfBoundsException();
		}catch(StringIndexOutOfBoundsException si){
			System.out.println(si);//异常对象si ， 捕获并抛出异常StringIndexOutOfBoundsException
		}
	}

}
