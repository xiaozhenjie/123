package com.���߳�;

public class AnonymousInnerClassDimo {

	public static void main(String[] args) {
		for(int i = 0 ; i<50 ;i++){
			System.out.println("�ڴ���Ϸ    "+i);
			if(i==10){
				//�̳�
				new Thread(){
					public void run(){
						for(int j = 0 ; j<50  ; j++){
							System.out.println("�ڿ���Ӱ "+j);
						}
					}
				}.start();
				
			}
		}

	}
	//�ӿ�
	private static void test1(){
		new Thread(new Runnable(){

			@Override
			public void run() {
				for(int j = 0 ; j<50  ; j++){
					System.out.println("�ڿ���Ӱ "+j);
				}
			}
			
		}).start();
	}
}
