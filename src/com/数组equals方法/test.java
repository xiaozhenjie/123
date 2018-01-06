package com.数组equals方法;

public class test {

	public static void main(String[] args) {
		char[] c1={'2','q'};
		char[] c2={'2','q'};
		System.out.println(c1.equals(c2));
		int[] i1={2,31,3};
		int[] i2={2,31,3};
		System.out.println(i1.equals(i2));
		double[] d1={231.23,12.2};
		double[] d2={231.23,12.2};
		System.out.println(d1.equals(d2));
		byte[] b1={23};
		byte[] b2={23};
		System.out.println(b1.equals(b2));
		short[] s1={32};
		short[] s2={23};
		System.out.println(s1.equals(s2));
		float[] f1={2.3f};
		float[] f2={2.3f};
		System.out.println(f1.equals(f2));
		
		String[] str1={"23"};
		String[] str2={"23"};
		System.out.println(str1.equals(str2));
		String str3="23";
		String str4="23";
		System.out.println(str3.equals(str4));

	}

}
