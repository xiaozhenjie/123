package com.���߳�;
class MusicRunnableImpl implements Runnable{

	@Override
	public void run() {
		for(int i=0 ; i < 500 ;i++){
			System.out.println("��������  "+i);
		}
	}
	
}
public class ImplementsRunnableDimo {

	public static void main(String[] args) {
		for(int i = 0 ; i<500 ;i++){
			System.out.println("��Ϸ    "+i);
			if(i==10){
				Thread t = new Thread(new MusicRunnableImpl());
				t.start();
			}
		}

	}

}
