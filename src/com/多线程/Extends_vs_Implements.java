package com.���߳�;
/**
 * �̳з���
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
//				System.out.println(super.getName()+"���˵�"+num--+"��ƻ��");
//				//����д����num--;
//			}
//		}
//	}
//}
/**
 * ʵ�ֽӿڷ���
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
					System.out.println(Thread.currentThread().getName()+"���˵�"+num--+"��ƻ��");
					Thread.sleep(10);
				}
			}
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
}
/**
 * ��ƻ�������������̳з�ʽ��ʵ�ֽӿڷ�ʽ
 * ---------------------------------------
 * �̳з�ʽ��
 * 		��1����java�����ǵ��̳еģ�����̳���Thread�ˣ�����Ͳ��ܼ̳�������ֱ�Ӹ����ˡ�
 * 		��2�����Ӳ����Ϸ������̳з�ʽ���򵥣���ȡ�߳�����Ҳ�򵥣������ϣ����򵥣�
 * 		��3�����Ӷ��̹߳���ͬһ����Դ�Ϸ������̳з�ʽ����������
 * �ӿڷ�ʽ��
 * 		��1����java������Զ�ʵ�ֽӿڣ���ʱ���໹���Լ̳������࣬���һ�����ʵ�������ӿڣ�����ϣ������ţ�
 * 		��2�����Ӳ����Ϸ�����ʵ�ַ�ʽ��΢���ӵ㣬��ȡ�߳�����Ҳ�Ƚϸ��ӣ���ʹ��Thread.currentThread()����ȡ�̵߳����á�
 * 		��3�����Ӷ��̹߳���һ����Դ�Ϸ�����ʵ�ַ�ʽ�����������Ƿ���ͬһ����Դ��
 * @author 47863
 *
 */
public class Extends_vs_Implements {

	public static void main(String[] args) {
		/**
		 * �̳и������� ��Ϊ������3���������
		 */
//		new Preson("����").start();
//		new Preson("����").start();
//		new Preson("����").start();
		/**
		 * ʹ�ýӿ�ʵ��
		 */
		Apple a=new Apple();
		new Thread(a,"Сa").start();
		new Thread(a,"Сb").start();
		new Thread(a,"Сc").start();
	}

}
