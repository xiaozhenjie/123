import java.io.IOException;
import java.util.Scanner;

public class next1 {

	public static void main(String[] args) throws IOException {
		char x;
		System.out.println("������һ���ַ���");
		try{
		x=(char)System.in.read();
		System.out.println("��������ַ��£�"+x);
		} catch (IOException e) {
		System.out.println("����ʱ�����쳣��");
			
		}
	}

}
