package com.string;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		//�ѿո��ֳ����� ���������Ԫ��
		String str = "ѧϰ java ���";
		String[] arr = str.split(" ");
		System.out.println("�ѿո��ֳ����飺"+Arrays.toString(arr));
		//һ������2���ֽ� һ����ĸһ���ֽ�
		byte[] b = str.getBytes();
		for(byte x:b){
			System.out.print(x+" ");
		}
		System.out.println();
		char c = 'a';
		char d = '��';
		int x = (int)d;
		System.out.println(c);
		System.out.println(x);
	}

}
