package com.p274_flashwindow;

public class FlashThread extends Thread{
	private FlashWindow fw;
	public FlashThread(FlashWindow fw){
		this.fw=fw;
		this.setName("FlashThread");//�����̵߳�����
	}
	public void run(){
		//��ǰ�߳�����
		System.out.println("FlashThread>>run>>��ǰ�߳��ǣ�"+Thread.currentThread().getName());
		//������ģ�����������0.2�룬��������ֵ�� ��ֱ��100Ϊֹ
		try {
			while(fw.progressBar.getValue()<100){
				fw.progressBar.setValue(fw.progressBar.getValue()+1);
				fw.progressBar.setString("ϵͳ���ڳ�ʼ��("+(fw.progressBar.getValue()+1)+"%)������");
				Thread.sleep(200);//��ǰ�߳�����0.2��
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fw.dispose();//�رմ���
	}
}
