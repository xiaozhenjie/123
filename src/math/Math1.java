package math;

public class Math1 {

	public static void main(String[] args) {
		double x;
		System.out.println("Math.PI="+Math.PI);//PI
		System.out.println("Math.E="+Math.E);//E
		x=Math.round(1.4999);//Math.round()�������뷽��   ������һ��    Math.round(-1.5)==-1.0
		System.out.println("Math.round(1.4999)="+x);
		x=Math.round(1.5);
		System.out.println("Math.round(1.5)="+x);
		x=Math.round(-1.5);//
		System.out.println("Math.round(-1.5)="+x);
		x=Math.abs(-123);//Math.abs() ���ز����ľ���ֵ
		System.out.println("Math.abs(-123)="+x);
		x=Math.pow(3, 2);//Math.pow() ���ص�һ�������ĵڶ��������Ĵ��ݵ�ֵ  3��2�η�
		System.out.println("Math.pow(3,2)="+x);
		x=Math.sqrt(9);//Math.sqrt() ������ȷ����Ĳ���ֵ����ƽ����  ����Ϊ������NaN
		System.out.println("Math.sqrt(9)="+x);
		x=Math.max(2, 3);//Math.max() �������������нϴ����һ��
		System.out.println("Math.max(2,3)="+x);
		x=Math.min(2, 3);//Math.min() �������������н�С����һ��
		System.out.println("Math.min(2,3)="+x);
		x=Math.floor(-0.1);
		System.out.println(x);
		
	}

}
