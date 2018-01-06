package comd;

public class Circular extends Ring{
	protected double length;
	Circular(){
		super();
		length=3;
	}
	Circular(double length){
		this("粗线",true,10.0d,8.0d,length);
	}
	Circular(String linestyle,boolean iscolor,double r,double r1,double length){
		super(linestyle,iscolor,r,r1);
		this.length=length;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double getLength(){
		return length;
	}
	public double getSuperficialArea(){
		return 2*Math.PI*length*(r+r1)+2*super.getArea();
	}
	public double getVolume(){
		return Math.PI*length*(r*r-r1*r1);
	}
	public String printInfo(){
		String s="【圆管】  外圆半径 ="+r+"，\t内圆半径 = "+r1+"，\t圆管长度 = "+length+"；\t绘制线型："+getLinestyle()+",颜色：";
		if(isColor()){
			s+="彩色";
		}else{
			s+="黑色";
		}
		return s;
	}
}
