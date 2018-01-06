package com.泛型与集合;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * add()方法中只能存放引用类型元素
 * 
 * @author 47863
 *
 */
public class Set接口 {

	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<Integer>();
		boolean f1 = intSet.add(50);
		boolean f2 = intSet.add(new Integer(323));
		boolean f3 = intSet.add(new Integer(102));
		boolean f4 = intSet.add(102);

		System.out.println(intSet);
		System.out.println("f1=" + f1);
		System.out.println("f2=" + f2);
		System.out.println("f3=" + f3);
		System.out.println("f4=" + f4);
	}

}
