import java.util.Scanner;
public class P123B {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		n=sc.nextInt();
		System.out.println("1!+2!+3!+...."+n+"!="+fact(2,n));
	}
	public static long fact(int x,int n){
		long f = 0;
		if(n<=0){
			System.out.println("��������ǣ�"+n+",�������󣬳����˳���");
			System.exit(0);
		}else if(x==n){
			f=n+1;
		}else{
			f=1+x*(fact(x+1,n));
		}
		return f;
	}

}
