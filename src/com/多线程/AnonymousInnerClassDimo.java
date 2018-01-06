package com.多线程;

public class AnonymousInnerClassDimo {

	public static void main(String[] args) {
		for(int i = 0 ; i<50 ;i++){
			System.out.println("在打游戏    "+i);
			if(i==10){
				//继承
				new Thread(){
					public void run(){
						for(int j = 0 ; j<50  ; j++){
							System.out.println("在看电影 "+j);
						}
					}
				}.start();
				
			}
		}

	}
	//接口
	private static void test1(){
		new Thread(new Runnable(){

			@Override
			public void run() {
				for(int j = 0 ; j<50  ; j++){
					System.out.println("在看电影 "+j);
				}
			}
			
		}).start();
	}
}
