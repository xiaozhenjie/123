import java.util.Scanner;
public class P121 {

	public static void main(String[] args) {
		int iVar1 = 0 ,iVar2 = 0;
		long lVar1=0l,lVar2=0l;
		float fVar1=0.0f,fVar2=0.0f;
		double dVar1=0.0d,dVar2=0.0d,dVar3=0.0d;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�������һ��������");
		iVar1=sc.nextInt();
		System.out.print("������ڶ���������");
		iVar2=sc.nextInt();
		System.out.println(iVar1+"��"+iVar2+"�У�������Ϊ��"+max(iVar1,iVar2));
		
		System.out.print("�������һ������������");
		lVar1=sc.nextLong();
		System.out.print("������ڶ�������������");
		lVar2=sc.nextLong();
		System.out.println(lVar1+"��"+lVar2+"�У�������Ϊ��"+max(lVar1,lVar2));
		
		System.out.print("�������һ�������ȸ���������");
		fVar1=sc.nextFloat();
		System.out.print("������ڶ��������ȸ���������");
		fVar2=sc.nextFloat();
		System.out.println(fVar1+"��"+fVar2+"�У�������Ϊ��"+max(fVar1,fVar2));
		
		System.out.print("�������һ��˫���ȸ���������");
		dVar1=sc.nextDouble();
		System.out.print("������ڶ���˫���ȸ���������");
		dVar2=sc.nextDouble();
		System.out.println(dVar1+"��"+dVar2+"�У�������Ϊ��"+max(dVar1,dVar2));
		
		System.out.print("�����������˫���ȸ���������");
		dVar3=sc.nextDouble();
		System.out.println(dVar1+"��"+dVar2+"��"+dVar3+"�У������Ϊ��"+max(dVar1,dVar2,dVar3));
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
