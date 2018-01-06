package com.NumberFormat;

import java.text.NumberFormat;

public class 百分比类型 {

	public static void main(String[] args) {
		double x=23d/100d;
		System.out.println(x);
		NumberFormat nf=NumberFormat.getPercentInstance();
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(x));
	}

}
