package com.多线程;
class MusicThread extends Thread{
	public void run(){
		for(int i=0 ; i < 500 ;i++){
			System.out.println("在听音乐  "+i);
		}
	}
}
public class ExtendsThreadDimo {

	public static void main(String[] args) {
		for(int i = 0 ; i<500 ;i++){
			System.out.println("在打游戏    "+i);
			if(i==10){
				MusicThread music=new MusicThread();
				music.start();
			}
		}

	}

}
