package com.NumberFormat;

import java.text.NumberFormat;

public class ���� {

	public static void main(String[] args) {
		NumberFormat nf=NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(23.1));

	}

}
