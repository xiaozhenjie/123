package exec;

import java.io.IOException;

public class P191 {

	public static void main(String[] args) {
		try {
			Process r=Runtime.getRuntime().exec("C:\\Users\\47863\\AppData\\Roaming\\Tencent\\QQGameTempest\\QQGame.exe");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
