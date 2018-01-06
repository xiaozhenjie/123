package com.多线程;
class MusicRunnableImpl implements Runnable{

	@Override
	public void run() {
		for(int i=0 ; i < 500 ;i++){
			System.out.println("在听音乐  "+i);
		}
	}
	
}
public class ImplementsRunnableDimo {

	public static void main(String[] args) {
		for(int i = 0 ; i<500 ;i++){
			System.out.println("游戏    "+i);
			if(i==10){
				Thread t = new Thread(new MusicRunnableImpl());
				t.start();
			}
		}

	}

}
