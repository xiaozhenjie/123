package com.try_catch;

public class FinallyAndReturn {
	private static int a=1;
	public static void main(String[] args) {
		int x;
		x=test2();
		System.out.println(x);
		System.out.println(a);
	}
	
	static int test1(){
		try{
			return 1;
		}finally{
			return 100;//返回100;
		}
	}
	static int test2(){
		try{
			return a;//返回的是1；但是结束方法之前会调用fanally a=2;
		}finally{
			a++;//
		}
	}
}
