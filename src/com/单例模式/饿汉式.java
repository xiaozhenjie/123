package com.单例模式;
class ArrayUtil{
	//1):创建出一个私有的静态的不可变的对象
	private static final ArrayUtil instance = new ArrayUtil();
	//2):私有化构造器
	private ArrayUtil(){}
	//3):向外暴露一个公共的静态方法用于获取自身的对象
	public static ArrayUtil getInstans(){
		return instance;
	}
	public void sort(int[] arr){
		System.out.println("排序操作");
	}
}
public class 饿汉式 {

	public static void main(String[] args) {
		//需要做排序，不同的类中
		ArrayUtil.getInstans().sort(null);
		//需要做排序，不同的类中
		ArrayUtil.getInstans().sort(null);
		//需要做排序，不同的类中
		ArrayUtil.getInstans().sort(null);
		//需要做排序，不同的类中
		ArrayUtil.getInstans().sort(null);
	}

}
