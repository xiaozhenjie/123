package com.NumberFormat;

import java.text.NumberFormat;

public class �ٷֱ����� {

	public static void main(String[] args) {
		double x=23d/100d;
		System.out.println(x);
		NumberFormat nf=NumberFormat.getPercentInstance();
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(x));
	}

}
