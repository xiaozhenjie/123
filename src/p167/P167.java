package p167;

import java.text.DecimalFormat;

public class P167 {

	public static void main(String[] args) {
		System.out.println("******************************圆球的数据计算********************************");
		Ball ball1=new Ball();
		System.out.println("（默认）"+ball1.printInfo());
		System.out.println("（默认）【圆球】 主类中调用   半径 = "+ball1.getRadius()+"，表面积 = "+keepNum(ball1.getSuperficialArea(),4)+"，体积 = "+keepNum(ball1.getVolume(),4));
		Ball ball2=new Ball(4);
		System.out.println("（有参构造）"+ball2.printInfo());
		System.out.println("（有参构造）【圆球】 主类中调用   半径 = "+ball2.getRadius()+"，表面积 = "+keepNum(ball2.getSuperficialArea(),4)+"，体积 = "+keepNum(ball2.getVolume(),4));
		Ball ball3=new Ball(-3);
		System.out.println("（半径-3）"+ball3.printInfo());
		System.out.println("******************************圆台的数据计算********************************");
		Circular circular1=new Circular();
		System.out.println("（默认）"+circular1.printInfo());
		System.out.println("（默认）【圆台】 主类中调用  顶部半径 = "+circular1.getR1()+"，底部半径 = "+circular1.getR2()+"，高 = "+circular1.getHeight()+"，表面积 = "+keepNum(circular1.getSuperficialArea(),4)+"，体积 = "+keepNum(circular1.getVolume(),4));
		Circular circular2=new Circular(2.0,3.5,3);
		System.out.println("（有参构造）"+circular2.printInfo());
		System.out.println("（有参构造）【圆台】 主类中调用  顶部半径 = "+circular2.getR1()+"，底部半径 = "+circular2.getR2()+"，高 = "+circular2.getHeight()+"，表面积 = "+keepNum(circular2.getSuperficialArea(),4)+"，体积 = "+keepNum(circular2.getVolume(),4));
		Circular circular3=new Circular(-3,2,3);
		System.out.println("（顶部半径-3）"+circular3.printInfo());
		System.out.println("******************************圆锥的数据计算********************************");
		Cone cone1=new Cone();
		System.out.println("（默认）"+cone1.printInfo());
		System.out.println("（默认）【圆锥】 主类中调用   半径 = "+cone1.getRadius()+"，高 = "+cone1.getHeight()+"，表面积 = "+keepNum(cone1.getSuperficialArea(),4)+"，体积 = "+keepNum(cone1.getVolume(),4));
		Cone cone2=new Cone(4,5);
		System.out.println("（有参构造）"+cone2.printInfo());
		System.out.println("（有参构造）【圆锥】 半径 = "+cone2.getRadius()+"，高 = "+cone2.getHeight()+"，表面积 = "+keepNum(cone2.getSuperficialArea(),4)+"，体积 = "+keepNum(cone2.getVolume(),4));
		Cone cone3=new Cone();
		cone3.setRadius(4);
		cone3.setHeight(5);
		System.out.println("（使用setter()设置半径和高）"+cone3.printInfo());
		Cone cone4=new Cone();
		cone4.setRadius(-4);
		cone4.setHeight(5);
		System.out.println("（使用setter()设置半径和高）"+cone4.printInfo());
	}
	public static String keepNum(double x,int n){
		String str="#.";
		for(int i=1;i<=n;i++){
			str+="#";
		}
		DecimalFormat df=new DecimalFormat(str);
		return df.format(x);
	}

}
