import java.util.Scanner;
public class P122 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("���������Ӹ�����");
		n=sc.nextInt();
		System.out.println("��Ҫ"+buZhou(n)+"�����");
	}
	public static long buZhou(int n){
		long l=0l;
		if(n<=0){
			System.out.println("����������Ӹ������󣬲���Ϊ�������㣬�����˳���");
			System.exit(0);

		}else if(n==1){
			l=1l;
		}else{
			l=(2*buZhou(n-1)+1);
		}
		return l;
	}

}
