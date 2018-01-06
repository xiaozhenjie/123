package p187_5_3;

import java.text.DecimalFormat;

public class P187 {

	public static void main(String[] args) {
		Round r1=new Round();//圆
		System.out.println("【默认】圆的半径为："+r1.getRadius()+"，面积为："+keepNum(r1.getArea(),4)+"，周长为："+keepNum(r1.getPerimeter(),3));
		Round r2=new Round(5.4);
		System.out.println("【有参】圆的半径为："+r2.getRadius()+"，面积为："+keepNum(r2.getArea(),4)+"，周长为："+keepNum(r2.getPerimeter(),3));
		Cuboid c1=new Cuboid();//长方体
		System.out.println("【默认】长方体的边长分别为："+c1.getLength()+"，"+c1.getWidth()+"，"+c1.getHeight()+"，表面积为："+keepNum(c1.getSuperficial(),4)+"，体积为："+keepNum(c1.getVolume(),4));
		Cuboid c2=new Cuboid(4,5,5);
		System.out.println("【有参】长方体的边长分别为："+c2.getLength()+"，"+c2.getWidth()+"，"+c2.getHeight()+"，表面积为："+keepNum(c2.getSuperficial(),4)+"，体积为："+keepNum(c2.getVolume(),4));
	}
	public static String keepNum(double x,int n){
		String str="#.";
		for(int i=0;i<n;i++){
			str+="#";
		}
		DecimalFormat df=new DecimalFormat(str);
		return df.format(x);
	}
}
