package com.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ��ͳIO�� {

	public static void main(String[] args) throws IOException {
		InputStreamReader in=new InputStreamReader(System.in);//���ֽ�����װ���ַ���
		System.out.println(in);
		BufferedReader br=new BufferedReader(in);//���ַ�����װ�ɻ�����
		System.out.println(br);
		String str=br.readLine();//�Ӽ��̶�ȡһ���ַ�����str��
		System.out.println(str);
		float score=Float.parseFloat(str);//���ַ���ת������ֵ�ͣ�������float��Ϊ�У������������ƴ���
		System.out.println(score);

	}

}
