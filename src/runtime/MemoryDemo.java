package runtime;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class MemoryDemo {

	public static void main(String[] args) {
		Runtime rObj=Runtime.getRuntime();//获取当前Runtime运行时对象的引用
		long num1,num2;
		Integer[] someints=new Integer[1000];
		System.out.println("内存总量："+rObj.totalMemory());
		num1=rObj.freeMemory();//返回空闲内存量并赋值给num1
		System.out.println("空闲内存："+num1);
		rObj.gc();//运行垃圾回收器回收未用对象
		num1=rObj.freeMemory();
		System.out.println("运行垃圾回收器后的空闲内存："+num1);
		//给数组长度为1000的整形数组分配存储空间
		for(int i=0;i<someints.length;i++){
			someints[i]=new Integer(i);
		}
		num2=rObj.freeMemory();
		//输出给数组分配存储空间后的内存空闲空间
		System.out.println("给数组分配存储空间后的内存空间："+num2);
		//输出占用的内存空间
		System.out.println("占用了内存空间："+(num1-num2));
		for(int i=0;i<someints.length;i++){
			someints[i]=null;//给数组分配存储空间为空
		}
		rObj.gc();
		num2=rObj.freeMemory();
		System.out.println("回收垃圾后的空闲内存："+num2);

		}

}
