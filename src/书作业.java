import java.util.Scanner;

public class ����ҵ {

	public static void main(String[] args) {
		 /*P71ҳ ��è����2-24
		  * ����s=1��+2��+3��+...m��
		  */
		int i=1,a=1,m;
		long s=0;
		Scanner x=new Scanner(System.in);
		System.out.println("������һ����m:");
		m=x.nextInt();
		do{
			a*=i;
			i++;
			s+=a;
			
		}while(i<=m);
			System.out.println("s=1��+2��+3��+..."+m+"!"+"\ns="+s);
	}

}
