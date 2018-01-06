package com.多线程;
/**
 * 继承方法
 * @author 47863
 *
 */
//class Preson extends Thread{
//	private static int num = 50;
//	public Preson(String name){
//		super(name);
//	}
//	public void run(){
//		for(int i = 0;i<50 ;i++){
//			if(num>0){
//				System.out.println(super.getName()+"吃了第"+num--+"个苹果");
//				//不能写在这num--;
//			}
//		}
//	}
//}
/**
 * 实现接口方法
 * @author 47863
 *
 */
class Apple implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		try {
			for(int i = 0;i<50 ;i++){
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"吃了第"+num--+"个苹果");
					Thread.sleep(10);
				}
			}
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
}
/**
 * 吃苹果比赛：分析继承方式和实现接口方式
 * ---------------------------------------
 * 继承方式：
 * 		（1）：java中类是单继承的，如果继承了Thread了，该类就不能继承其他的直接父类了。
 * 		（2）：从操作上分析，继承方式更简单，获取线程名字也简单（操作上，更简单）
 * 		（3）：从多线程共享同一个资源上分析，继承方式不能做到。
 * 接口方式：
 * 		（1）：java中类可以多实现接口，此时该类还可以继承其他类，并且还可以实现其他接口（设计上，更优雅）
 * 		（2）：从操作上分析，实现方式稍微复杂点，获取线程名字也比较复杂，得使用Thread.currentThread()来获取线程的引用。
 * 		（3）：从多线程共享一个资源上分析，实现方式可以做到（是否共享同一个资源）
 * @author 47863
 *
 */
public class Extends_vs_Implements {

	public static void main(String[] args) {
		/**
		 * 继承更不合理 因为创建了3个该类对象
		 */
//		new Preson("张三").start();
//		new Preson("李四").start();
//		new Preson("王五").start();
		/**
		 * 使用接口实现
		 */
		Apple a=new Apple();
		new Thread(a,"小a").start();
		new Thread(a,"小b").start();
		new Thread(a,"小c").start();
	}

}
