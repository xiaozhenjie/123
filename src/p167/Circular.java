package p167;

public class Circular implements Round{
	private double r1;
	private double r2;
	private double height;
	Circular(){
		r1=1;
		r2=2;
		height=1;
	}
	Circular(double r,double R,double height){
		if(r<0||R<0||height<0){
			System.out.println("构造方法提示：有半径或高小于0，无法构成圆台。");
		}
			this.r1=r;
			this.r2=R;
			this.height=height;
	}
	public void setR1(double r1){
		this.r1=r1;
	}
	public void setR2(double r2){
		this.r2=r2;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getR1(){
		return r1;
	}
	public double getR2(){
		return r2;
	}
	public double getHeight(){
		return height;
	}
	public double getL(){
		return Math.sqrt((r2-r1)*(r2-r1)+height*height);
	}
	public double getSuperficialArea(){
		if(r1<0||r2<0||height<0){
			System.out.println("有半径或高小于0，无法计算表面积。");
			return 0;
		}else{
			return PI*(r1*r1+r2*r2+r1*getL()+r2*getL());
		}
	}
	public double getVolume(){
		if(r1<0||r2<0||height<0){
			System.out.println("有半径或高小于0，无法计算体积。");
			return 0;
		}else{
			return PI*height*(r1*r1+r2*r2+r1*r2)/3;
		}
	}
	public String printInfo(){
		String s="【圆台】顶部半径 = "+r1+"，底部半径 = "+r2+"，高 = "+height;
		if(getSuperficialArea()!=0){
			s+="，表面积 = "+getSuperficialArea();
		}
		if(getVolume()!=0){
			s+="，体积 = "+getVolume();
		}
		return s;
	}
}
