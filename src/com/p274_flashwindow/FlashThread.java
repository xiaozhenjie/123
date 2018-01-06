package com.p274_flashwindow;

public class FlashThread extends Thread{
	private FlashWindow fw;
	public FlashThread(FlashWindow fw){
		this.fw=fw;
		this.setName("FlashThread");//设置线程的名字
	}
	public void run(){
		//当前线程名称
		System.out.println("FlashThread>>run>>当前线程是："+Thread.currentThread().getName());
		//本案例模拟进度条美隔0.2秒，进度条的值加 ，直到100为止
		try {
			while(fw.progressBar.getValue()<100){
				fw.progressBar.setValue(fw.progressBar.getValue()+1);
				fw.progressBar.setString("系统正在初始化("+(fw.progressBar.getValue()+1)+"%)。。。");
				Thread.sleep(200);//当前线程休眠0.2秒
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fw.dispose();//关闭窗口
	}
}
