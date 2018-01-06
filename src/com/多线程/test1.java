package com.多线程;
class Apples1 implements Runnable{
	private int num = 500;
	@Override
	public void run() {
		for(int i = 0;i<500;i++){
			eat();
		}
	}
	synchronized private void eat(){
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"吃了第"+num--+"个苹果");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
public class test1 {

	public static void main(String[] args) {
		
		Apples1 a = new Apples1();
		new Thread(a,"张三").start();
		new Thread(a,"李四").start();
		new Thread(a,"王五").start();
		
	}

}
