package com.���߳�;
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
		System.out.println("�������");
	}
}
public class ����ģʽ {
	public static void main(String[] args) {
		
	}
}
