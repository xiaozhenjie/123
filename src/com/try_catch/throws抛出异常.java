package com.try_catch;

import java.util.Scanner;

public class throws抛出异常 {

	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入一个小于5的数：");
			Arrays(sc.nextInt());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组下标不能大于5");
		}

	}
	static void Arrays(int index) throws ArrayIndexOutOfBoundsException{
		int[] x = new int[5];
		for(int i=0;i<x.length;i++){
			x[i]=i+1;
		}
		System.out.println("x["+index+"]="+x[index]);
	}

}
