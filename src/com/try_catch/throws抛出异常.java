package com.try_catch;

import java.util.Scanner;

public class throws�׳��쳣 {

	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("������һ��С��5������");
			Arrays(sc.nextInt());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�����±겻�ܴ���5");
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
