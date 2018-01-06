import java.io.IOException;

public class java4 {

	public static void main(String[] args) throws IOException {
		int i=0;
		char ch1,ch2;
		System.out.println("ÊäÈëÒ»Ð©×Ö·û£º");
		do{
			ch1=(char)System.in.read();
			if(ch1>=65&&ch1<=90){
				ch1=(char)(ch1+32);
				System.out.println(ch1);
				i++;
			}else if(ch1>=97&&ch1<=122){
				ch1=(char)(ch1-32);
				System.out.println(ch1);
				i++;
			}else System.out.println(ch1);
			do{
				ch2=(char)System.in.read();
			}while(ch2!='\n');
		}while(ch1!='.');
		System.out.print(i);

	}

}
