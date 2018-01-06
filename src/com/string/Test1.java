package com.string;

public class Test1 {

	public static void main(String[] args) {
		char[] x={'t','e','x','t'};
		char[] y={'t','e','x','t','1'};
		String s1=new String(x);
		System.out.println(s1);
		String s2=new String(y,2,2);
		System.out.println(s2);
		char p = '\n';
		System.out.println((int)p);

	}

}
