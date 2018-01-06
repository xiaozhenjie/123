package comd;

public class Ring extends Round{
	protected double r1; 
	Ring(){
		super();
		r1=0.5;
	}
	Ring(String linestyle,boolean iscolor,double r,double r1){
		super(linestyle,iscolor,r);
		this.r1=r1;
	}
	public void setR1(double r1){
		this.r1=r1;
	}
	public double getR1(){
		return r1;
	}
	public double getArea(){
		return 2*Math.PI*(r-r1);
	}
	public double getRPerimeter(){
		return 2*Math.PI*r;
	}
	public double getR1Perimeter(){
		return 2*Math.PI*r1;
	}
	public String printInfo(){
		String s="【圆环】  外圆半径 ="+r+"，\t内圆半径 ="+r1+"；\t绘制线型："+getLinestyle()+"，\t颜色：";
		if(isColor()){
			s+="彩色";
		}else{
			s+="黑色";
		}
		return s;
	}
}
