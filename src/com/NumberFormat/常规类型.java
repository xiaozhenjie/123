package com.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class 常规类型 {

	public static void main(String[] args) {
		NumberFormat nf=NumberFormat.getInstance();
		double x=2.333;
		//nf.setMinimumFractionDigits(1);//设置最小小数位
		nf.setMaximumFractionDigits(2);//设置最大小数位
		//nf.setMaximumIntegerDigits(4);//设置最大整数位
		//nf.setMinimumIntegerDigits(3);//设置最小整数位
		System.out.println(nf.format(x));
		
		int y=2313212;
		NumberFormat usFormat=NumberFormat.getIntegerInstance(Locale.US);
		System.out.println(y+"的美国表示法是："+usFormat.format(y));
		NumberFormat germanFormat=NumberFormat.getIntegerInstance(Locale.GERMANY);
		System.out.println(y+"的德国表示法是："+germanFormat.format(y));	

	}

}
