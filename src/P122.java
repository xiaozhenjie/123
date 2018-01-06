import java.util.Scanner;
public class P122 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入盘子个数：");
		n=sc.nextInt();
		System.out.println("需要"+buZhou(n)+"步完成");
	}
	public static long buZhou(int n){
		long l=0l;
		if(n<=0){
			System.out.println("你输入的盘子个数有误，不能为负数或零，程序退出！");
			System.exit(0);

		}else if(n==1){
			l=1l;
		}else{
			l=(2*buZhou(n-1)+1);
		}
		return l;
	}

}
