import java.util.Scanner;

public class 书作业P75 {

	public static void main(String[] args) {
		int g,m,x,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		s=sc.nextInt();
		for(g=1;g<=(s-2);g++){
			for(m=1;m<=(s-2);m++){
				 if(7*g+4*m!=s)
					continue;
		       x=s-g-m;
		       System.out.println("公鸡："+g+"只， 母鸡："+m+"只， 小鸡"+x);
			}
	}

	}

}
