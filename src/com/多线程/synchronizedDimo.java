package com.多线程;
class Apple1 implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		try {
			for(int i = 0;i<50 ;i++){
				eat();
			}
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/**
	 * synchronized安全 性能低
	 * 尽量减少synchronized作用域
	 * @throws InterruptedException 
	 */
	
	synchronized private void eat() throws InterruptedException{
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"吃了第"+num--+"个苹果");
			Thread.sleep(10);
		}
	}
}
public class synchronizedDimo {

	public static void main(String[] args) {
		Apple1 a=new Apple1();
		new Thread(a,"小a").start();
		new Thread(a,"小b").start();
		new Thread(a,"小c").start();

	}

}
