package com.���߳�;
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
			System.out.println(Thread.currentThread().getName()+"���˵�"+num--+"��ƻ��");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
public class test1 {

	public static void main(String[] args) {
		
		Apples1 a = new Apples1();
		new Thread(a,"����").start();
		new Thread(a,"����").start();
		new Thread(a,"����").start();
		
	}

}
