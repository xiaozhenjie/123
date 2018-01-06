package com.string;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		//把空格拆分成数组 并输出数组元素
		String str = "学习 java 编程";
		String[] arr = str.split(" ");
		System.out.println("把空格拆分成数组："+Arrays.toString(arr));
		//一个汉字2个字节 一个字母一个字节
		byte[] b = str.getBytes();
		for(byte x:b){
			System.out.print(x+" ");
		}
		System.out.println();
		char c = 'a';
		char d = '你';
		int x = (int)d;
		System.out.println(c);
		System.out.println(x);
	}

}
