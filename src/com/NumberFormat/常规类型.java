package com.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class �������� {

	public static void main(String[] args) {
		NumberFormat nf=NumberFormat.getInstance();
		double x=2.333;
		//nf.setMinimumFractionDigits(1);//������СС��λ
		nf.setMaximumFractionDigits(2);//�������С��λ
		//nf.setMaximumIntegerDigits(4);//�����������λ
		//nf.setMinimumIntegerDigits(3);//������С����λ
		System.out.println(nf.format(x));
		
		int y=2313212;
		NumberFormat usFormat=NumberFormat.getIntegerInstance(Locale.US);
		System.out.println(y+"��������ʾ���ǣ�"+usFormat.format(y));
		NumberFormat germanFormat=NumberFormat.getIntegerInstance(Locale.GERMANY);
		System.out.println(y+"�ĵ¹���ʾ���ǣ�"+germanFormat.format(y));	

	}

}
