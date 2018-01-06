package com.多线程;
class ArrayUtil{
	private volatile static  ArrayUtil instance = null;
	private ArrayUtil(){
		if(instance == null){
			synchronized(ArrayUtil.class){
				if(instance == null){
					instance = new ArrayUtil();
				}
			}
		}
	}
	public ArrayUtil getInstance(){
		return instance;
	}
	public void sort(int[] arr){
		System.out.println("排序操作");
	}
}
public class 懒汉模式 {
	public static void main(String[] args) {
		
	}
}
