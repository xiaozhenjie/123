package com.equals;

public class Equals {

	public static void main(String[] args) {
		String str1=new String("112");//String str="hello";如果之前有String对象是hello的值，那str就直接指向之前那个对象了，不再重新new一个对象了
		String str2=new String("112");//String str=new String("hello"); 无论以前有没有都重新new一个新的
		System.out.println(str1==str2);
		//System.out.println(str1.equals(str2));
		String str3="112";
		String str4="112";
		System.out.println(str1.equals(str3));
		System.out.println(str1.hashCode()==str3.hashCode());//x.equals(y)==true  则x.hashCode()==y.hashCode();
		System.out.println(str3==str4);
		//System.out.println(str2.equals(str3));
		//System.out.println(str2==str3);
		int[] a={1,2,3};
		int[] b={1,2,3};
		//System.out.println(a==b);
		//System.out.println(a.equals(b));

	}

}
