package math;

public class Math1 {

	public static void main(String[] args) {
		double x;
		System.out.println("Math.PI="+Math.PI);//PI
		System.out.println("Math.E="+Math.E);//E
		x=Math.round(1.4999);//Math.round()四舍五入方法   负数不一定    Math.round(-1.5)==-1.0
		System.out.println("Math.round(1.4999)="+x);
		x=Math.round(1.5);
		System.out.println("Math.round(1.5)="+x);
		x=Math.round(-1.5);//
		System.out.println("Math.round(-1.5)="+x);
		x=Math.abs(-123);//Math.abs() 返回参数的绝对值
		System.out.println("Math.abs(-123)="+x);
		x=Math.pow(3, 2);//Math.pow() 返回第一个参数的第二个参数的次幂的值  3的2次方
		System.out.println("Math.pow(3,2)="+x);
		x=Math.sqrt(9);//Math.sqrt() 返回正确舍入的参数值的正平方根  参数为负返回NaN
		System.out.println("Math.sqrt(9)="+x);
		x=Math.max(2, 3);//Math.max() 返回两个参数中较大的那一个
		System.out.println("Math.max(2,3)="+x);
		x=Math.min(2, 3);//Math.min() 返回两个参数中较小的那一个
		System.out.println("Math.min(2,3)="+x);
		x=Math.floor(-0.1);
		System.out.println(x);
		
	}

}
