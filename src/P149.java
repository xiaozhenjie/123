class Area{
	public double getEllipse(double a,double b){
		return Math.PI*a*b;
	}
	public double getRectangle(double a,double b){
		return a*b;
	}
}
class Ellipse extends Area{
	public double getEllipse(double a,double b){
		return 2*Math.PI*b+4*(a-b);
	}
}
class Rectangle1 extends Area{
	public double getRectangle(double a,double b){
		return 2*(a+b);
	}
}
public class P149 {

	public static void main(String[] args) {
		double ellA,ellP,recA,recP;
		Area objSuper=new Area();
		Ellipse objEll=new Ellipse();
		Rectangle1 objRec=new Rectangle1();
		ellA=Math.rint(objSuper.getEllipse(5.0,4.0)*1000)/1000;//调用父类的方法求椭圆面积
		ellP=Math.rint(objEll.getEllipse(5.0, 4.0)*1000)/1000;//调用子类的方法求椭圆周长
		recA=Math.rint(objSuper.getRectangle(5.0,4.0)*1000)/1000;//调用父类的方法求长方形面积
		recP=Math.rint(objRec.getRectangle(5.0, 4.0)*1000)/1000;//调用子类的方法求长方形面积
		System.out.println("椭圆的面积为："+ellA);
		System.out.println("椭圆的周长为："+ellP);
		System.out.println("长方形的面积为："+recA);
		System.out.println("长方形的周长为："+recP);
	}

}
