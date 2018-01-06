import java.util.Scanner;

public class 书作业 {

	public static void main(String[] args) {
		 /*P71页 照猫画虎2-24
		  * 计算s=1！+2！+3！+...m！
		  */
		int i=1,a=1,m;
		long s=0;
		Scanner x=new Scanner(System.in);
		System.out.println("请输入一个数m:");
		m=x.nextInt();
		do{
			a*=i;
			i++;
			s+=a;
			
		}while(i<=m);
			System.out.println("s=1！+2！+3！+..."+m+"!"+"\ns="+s);
	}

}
