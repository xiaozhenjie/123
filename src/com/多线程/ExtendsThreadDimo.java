package com.���߳�;
class MusicThread extends Thread{
	public void run(){
		for(int i=0 ; i < 500 ;i++){
			System.out.println("��������  "+i);
		}
	}
}
public class ExtendsThreadDimo {

	public static void main(String[] args) {
		for(int i = 0 ; i<500 ;i++){
			System.out.println("�ڴ���Ϸ    "+i);
			if(i==10){
				MusicThread music=new MusicThread();
				music.start();
			}
		}

	}

}
