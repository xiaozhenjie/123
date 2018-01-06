package comd;

public class Cylinder extends Round{
	protected double h;
	Cylinder(){
		super();
		h=1;
	}
	Cylinder(double h){
		this("粗线",true,3.0d,h);
	}
	Cylinder(String linestyle,boolean iscolor,double r,double h){
		super(linestyle,iscolor,r);
		this.h=h;
	}
	public void setH(double h){
		this.h=h;
	}
	public double getH(){
		return h;
	}
	public double getSuperficialArea(){          //计算圆柱表面积方法
		return 2*Math.PI*r*(h+r);
	}
	public double getVolume(){
		return Math.PI*r*r*h;
	}
	public String printInfo(){
		String s="【圆柱】  半径 ="+r+" ，\t高 ="+h+"；          \t绘制线型："+getLinestyle()+"，\t颜色：";
		if(isColor()){
			s+="彩色";
		}else{
			s+="黑色";
		}
		return s;
	}
}
