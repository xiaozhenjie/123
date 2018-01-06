import java.util.Scanner;
public class P121 {

	public static void main(String[] args) {
		int iVar1 = 0 ,iVar2 = 0;
		long lVar1=0l,lVar2=0l;
		float fVar1=0.0f,fVar2=0.0f;
		double dVar1=0.0d,dVar2=0.0d,dVar3=0.0d;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("请输入第一个整数：");
		iVar1=sc.nextInt();
		System.out.print("请输入第二个整数：");
		iVar2=sc.nextInt();
		System.out.println(iVar1+"和"+iVar2+"中，最大的数为："+max(iVar1,iVar2));
		
		System.out.print("请输入第一个长整形数：");
		lVar1=sc.nextLong();
		System.out.print("请输入第二个长整形数：");
		lVar2=sc.nextLong();
		System.out.println(lVar1+"和"+lVar2+"中，最大的数为："+max(lVar1,lVar2));
		
		System.out.print("请输入第一个单精度浮点型数：");
		fVar1=sc.nextFloat();
		System.out.print("请输入第二个单精度浮点型数：");
		fVar2=sc.nextFloat();
		System.out.println(fVar1+"和"+fVar2+"中，最大的数为："+max(fVar1,fVar2));
		
		System.out.print("请输入第一个双精度浮点型数：");
		dVar1=sc.nextDouble();
		System.out.print("请输入第二个双精度浮点型数：");
		dVar2=sc.nextDouble();
		System.out.println(dVar1+"和"+dVar2+"中，最大的数为："+max(dVar1,dVar2));
		
		System.out.print("请输入第三个双精度浮点型数：");
		dVar3=sc.nextDouble();
		System.out.println(dVar1+"和"+dVar2+"和"+dVar3+"中，最大数为："+max(dVar1,dVar2,dVar3));
	}
	public static int max(int num1,int num2){
		if(num1>num2){
			return num1;
		}else{
			return num2;
		}
	}
	public static long max(long num1,long num2){
		if(num1>num2){
			return num1;
		}else{
			return num2;
		}
	}
	public static float max(float num1,float num2){
		if(num1>num2){
			return num1;
		}else{
			return num2;
		}
	}
	public static double max(double num1,double num2){
		if(num1>num2){
			return num1;
		}else{
			return num2;
		}
	}
	public static double max(double num1,double num2,double num3){
		return max(max(num1,num2),num3);
	}
	

}
