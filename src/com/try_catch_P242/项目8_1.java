package com.try_catch_P242;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 项目8_1 {

	public static void main(String[] args) throws IOException {
		try{
			BufferedReader buf = null;
			buf = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			System.out.println("请输入5个整数：");
			int min = getMin(Integer.valueOf(buf.readLine()),Integer.valueOf(buf.readLine()),Integer.valueOf(buf.readLine()),Integer.valueOf(buf.readLine()),Integer.valueOf(buf.readLine()));
			System.out.println("最小值为："+min);
		}catch(NumberFormatException e){
			System.out.println("输入有误，抛出异常！");
		}

	}
	private static int getMin(int ...x){
		int min = Integer.MAX_VALUE;
		for(int y:x){
			min = y;
			if(min>y){
				min = y;
			}
		}
		return min;
	}

}
