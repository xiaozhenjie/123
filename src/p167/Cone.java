package p167;

public class Cone implements Round{
	private double radius;
	private double height;
	Cone(){
		radius=1;
		height=1;
	}
	Cone(double r,double h){
		if(r<0||h<0){
			System.out.println("构造方法提示：有半径或高小于0，无法构成圆锥。");
		}
			this.radius=r;
			this.height=h;
	}
	public void setRadius(double r){
		this.radius=r;
	}
	public void setHeight(double h){
		this.height=h;
	}
	public double getRadius(){
		return radius;
	}
	public double getHeight(){
		return height;
	}
	public double getL(){
		return Math.sqrt(radius*radius+height*height);
	}
	public double getSuperficialArea(){
		if(radius<0||height<0){
			System.out.println("有半径或高小于0，无法计算表面积。");
			return 0;
		}else{
			return PI*radius*getL()+PI*radius*radius;
		}
	}
	public double getVolume(){
		if(radius<0||height<0){
			System.out.println("有半径或高小于0，无法计算体积。");
			return 0;
		}else{
			return PI*radius*radius*height/3;
		}
	}
	public String printInfo(){
		String s="【圆锥】 半径 = "+radius+"，高 = "+height;
		if(getSuperficialArea()!=0){
			s+="，表面积 = "+getSuperficialArea();
		}
		if(getVolume()!=0){
			s+="，体积 = "+getVolume();
		}
		return s;
	}
}
