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
			return 100;//����100;
		}
	}
	static int test2(){
		try{
			return a;//���ص���1�����ǽ�������֮ǰ�����fanally a=2;
		}finally{
			a++;//
		}
	}
}
