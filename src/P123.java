import java.util.Scanner;
public class P123 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ��������");
		n=sc.nextInt();
		System.out.println("1!+2!+3!+....+"+n+"!="+factJia(n));

	}
	public static long factJia(int n){
		long f=0;
		for( ;n>0;n--){
			f += fact(n);
		}
		return f;
	}
	public static long fact(int n){
		long f=1;
		if(n<0){
			System.out.println("���������"+n+"���������󣬳����˳���");
			System.exit(0);
		}else if(n==0||n==1){
			f=1;
		}else {
			f=fact(n-1)*n;
		}
		return f;
	}

}
