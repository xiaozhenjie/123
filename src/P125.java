import java.util.Scanner;
public class P125 {

	public static void main(String[] args) {
		double dVar=0d,d=0.0d;
		int x=0,y=0;
		double z=0.0d;
		Scanner sc=new Scanner(System.in);
		System.out.println("�������Ի���Ϊ��λ�ĽǶȣ�");
		dVar=sc.nextDouble();
		System.out.println("sin("+dVar+")="+Math.sin(dVar));
		System.out.println("cos("+dVar+")="+Math.cos(dVar));
		System.out.println("tan("+dVar+")="+Math.tan(dVar));
		System.out.println("cot("+dVar+")="+1.0d/Math.tan(dVar));
		d=Math.toDegrees(dVar);
		x=(int)(d);
		y=(int)(d*10%10/10*60);
		z=d*100%10/10*60;

		System.out.print(dVar+"ת��Ϊ�Ƕ��ǣ�"+x+"��"+y+"��");
		System.out.print(y);
		System.out.printf("%.2f��",z);
	}

}
