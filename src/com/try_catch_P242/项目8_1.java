package com.try_catch_P242;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ��Ŀ8_1 {

	public static void main(String[] args) throws IOException {
		try{
			BufferedReader buf = null;
			buf = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			System.out.println("������5��������");
			int min = getMin(Integer.valueOf(buf.readLine()),Integer.valueOf(buf.readLine()),Integer.valueOf(buf.readLine()),Integer.valueOf(buf.readLine()),Integer.valueOf(buf.readLine()));
			System.out.println("��СֵΪ��"+min);
		}catch(NumberFormatException e){
			System.out.println("���������׳��쳣��");
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
