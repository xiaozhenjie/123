import java.util.Scanner;

public class sd {

	public static void main(String[] args) {
		int g,m,x,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		s=sc.nextInt();
		for(g=1;g<=(s-2);g++){
			for(m=1;m<=(s-2);m++)
				stop1:{
				 if(7*g+4*m!=s)
					break stop1;
		       x=s-g-m;
		       System.out.println("������"+g+"ֻ�� ĸ����"+m+"ֻ�� С��"+x);
			}
	}
	

	}

}
