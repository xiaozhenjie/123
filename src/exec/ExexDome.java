package exec;

import java.io.IOException;
public class ExexDome {

	public static void main(String[] args) throws IOException {
//		Runtime r=Runtime.getRuntime();
//		Process p=null;//声明Process的一个对象p
//		try{
//			p=r.exec("notepad");//调用exec()方法运行程序notrpad
//		}catch(Exception e){
//			System.out.println("执行记事本时出错");
//		}
		//方法2
		ProcessBuilder pb = new ProcessBuilder("notepad");
		pb.start();
//		try{
//			Process p1=Runtime.getRuntime().exec("C:\\Users\\47863\\AppData\\Roaming\\Tencent\\QQGameTempest\\QQGame.exe");//调用exec()方法运行程序notepad;
//		}catch(Exception e){
//			System.out.println("执行Windows的记事本时出错.");
//		}
	}

}
