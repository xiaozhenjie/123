import java.io.IOException;
import java.util.Scanner;

public class next1 {

	public static void main(String[] args) throws IOException {
		char x;
		System.out.println("请输入一个字符：");
		try{
		x=(char)System.in.read();
		System.out.println("你输入的字符事："+x);
		} catch (IOException e) {
		System.out.println("输入时出现异常。");
			
		}
	}

}
