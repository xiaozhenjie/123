package com.���߳�;
class Apple1 implements Runnable{
	private int num = 50;
	@Override
	public void run() {
		try {
			for(int i = 0;i<50 ;i++){
				eat();
			}
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	/**
	 * synchronized��ȫ ���ܵ�
	 * ��������synchronized������
	 * @throws InterruptedException 
	 */
	
	synchronized private void eat() throws InterruptedException{
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"���˵�"+num--+"��ƻ��");
			Thread.sleep(10);
		}
	}
}
public class synchronizedDimo {

	public static void main(String[] args) {
		Apple1 a=new Apple1();
		new Thread(a,"Сa").start();
		new Thread(a,"Сb").start();
		new Thread(a,"Сc").start();

	}

}
