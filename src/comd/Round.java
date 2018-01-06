package comd;

public class Round extends Geometries{
	protected double r;
	Round(){
		super();
		r=1;
	}
	Round(String linestyle,boolean iscolor,double r){
		super(linestyle,iscolor);
		this.r=r;
	}
	public void setR(double r){
		this.r=r;
	}
	public double getR(){
		return r;
	}
	public double getArea(){
		return Math.PI*r*r;
	}
	public double getPerimeter(){
		return 2*Math.PI*r;
	}
	public String printInfo(){
		String s="【圆形】  半径 ="+r+"；\t绘制线型："+getLinestyle()+"，\t颜色：";
		if(isColor()){
			s+="彩色";
		}else{
			s+="黑色";
		}
		return s;
	}
}
