import java.util.Scanner;

public class ����ҵP75 {

	public static void main(String[] args) {
		int g,m,x,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		s=sc.nextInt();
		for(g=1;g<=(s-2);g++){
			for(m=1;m<=(s-2);m++){
				 if(7*g+4*m!=s)
					continue;
		       x=s-g-m;
		       System.out.println("������"+g+"ֻ�� ĸ����"+m+"ֻ�� С��"+x);
			}
	}

	}

}
