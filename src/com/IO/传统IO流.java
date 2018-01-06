package com.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 传统IO流 {

	public static void main(String[] args) throws IOException {
		InputStreamReader in=new InputStreamReader(System.in);//将字节流包装成字符流
		System.out.println(in);
		BufferedReader br=new BufferedReader(in);//将字符流包装成缓冲流
		System.out.println(br);
		String str=br.readLine();//从键盘读取一行字符串到str中
		System.out.println(str);
		float score=Float.parseFloat(str);//将字符串转换成数值型，这里以float型为列，其他类型类似处理
		System.out.println(score);

	}

}
