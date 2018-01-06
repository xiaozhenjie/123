import java.util.Scanner;

public class P119 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入3个数：");
		jiaoHuang(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
	}
	static double d=0.0d;
	private static void jiaoHuang(double x,double y, double z){
		System.out.println("交换前:  "+ x+"   "+y+"   "+z);
		if(!(x>y&&x>z||x<y&&x<z)){
			d=z;
			z=y;
			y=d;
		}
		if(!(y>x&&y>z||y<x&&y<z)){
			d=x;
			x=z;
			z=d;
		}
		if(!(z>x&&z>y||z<x&&z<y)){
			d=x;
			x=y;
			y=d;
		}
		System.out.println("交换后 :  "+x+"   "+y+"   "+z);
		
	}


}
