package exec;

import java.io.IOException;
public class ExexDome {

	public static void main(String[] args) throws IOException {
//		Runtime r=Runtime.getRuntime();
//		Process p=null;//����Process��һ������p
//		try{
//			p=r.exec("notepad");//����exec()�������г���notrpad
//		}catch(Exception e){
//			System.out.println("ִ�м��±�ʱ����");
//		}
		//����2
		ProcessBuilder pb = new ProcessBuilder("notepad");
		pb.start();
//		try{
//			Process p1=Runtime.getRuntime().exec("C:\\Users\\47863\\AppData\\Roaming\\Tencent\\QQGameTempest\\QQGame.exe");//����exec()�������г���notepad;
//		}catch(Exception e){
//			System.out.println("ִ��Windows�ļ��±�ʱ����.");
//		}
	}

}
