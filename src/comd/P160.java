package comd;

import java.text.DecimalFormat;

public class P160 {

	public static void main(String[] args) {
		Round round1=new Round();
		displayGeometriesObject("使用无参构造方法创建圆形对象round1后：",round1);
		round1.setR(3);
		displayGeometriesObject("调用原型对象round1的setter()方法后：",round1);		
		Round round2=new Round("粗线",true,4.0d);
		displayGeometriesObject("使用有参构造方法创建圆形对象round2后：",round2);
		Cylinder cylinder1=new Cylinder();
		displayGeometriesObject("使用无参构造方法创建圆柱形对象cylinder1后：",cylinder1);
		Round cylinder2=new Cylinder(10);
		displayGeometriesObject("使用Round类声明并创建圆柱类对象cylinder2后",cylinder2);//输出了面积和周长  不应使用
		Cylinder cylinder3=new Cylinder("粗线",false,5.0,8.0);
		displayGeometriesObject("使用有参构造方法创建圆柱形对象cylinder3后：",cylinder3);
		Ring ring1=new Ring();
		displayGeometriesObject("使用无参构造方法创建圆环对象ring1后：",ring1);
		Ring ring2=new Ring("细线",true,6,4);
		displayGeometriesObject("使用有参构造方法创建圆环对象ring2后：",ring2);
		Circular circular1=new Circular();
		displayGeometriesObject("使用无参构造方法创建圆管对象circular1后：",circular1);
		System.out.println(circular1.printInfo());
		System.out.println("表面积："+keepNum(circular1.getSuperficialArea())+"，\t体积："+keepNum(circular1.getVolume()));
		Circular circular2=new Circular("粗线",true,8,6,10);
		displayGeometriesObject("使用有参构造方法创建圆管对象circular2后：",circular2);
		System.out.println(circular2.printInfo());
		System.out.println("表面积："+keepNum(circular2.getSuperficialArea())+"，\t体积："+keepNum(circular2.getVolume()));
		

	}
	//圆形
	public static void displayGeometriesObject(String s,Geometries obj){
		System.out.println(s);
		System.out.println(obj.printInfo());
		System.out.print("面积："+keepNum(obj.getArea())+"\t");
		System.out.println("周长："+keepNum(obj.getPerimeter())+"\t");
	}
	//圆柱
	public static void displayGeometriesObject(String s,Cylinder obj){
		System.out.println(s);
		System.out.println(obj.printInfo());
		System.out.print("表面积："+keepNum(obj.getSuperficialArea())+"\t");
		System.out.println("体积："+keepNum(obj.getVolume())+"\t");
	}
	//圆环
	public static void displayGeometriesObject(String s,Ring obj){
		System.out.println(s);
		System.out.println(obj.printInfo());
		System.out.print("面积："+keepNum(obj.getArea())+"\t");
		System.out.print("内圆周长："+keepNum(obj.getR1Perimeter())+"\t");
		System.out.println("外圆周长："+keepNum(obj.getRPerimeter())+"\t");
	}
	//圆管
	public static void displayGeometriesObject(String s,Circular obj){
		System.out.println(s);
		System.out.println(obj.printInfo());
		System.out.print("表面积："+keepNum(obj.getSuperficialArea())+"\t");
		System.out.println("体积："+keepNum(obj.getVolume())+"\t");
	}
	public static String keepNum(double x){
		DecimalFormat df=new DecimalFormat("#.###");
		return df.format(x);
	}

}
