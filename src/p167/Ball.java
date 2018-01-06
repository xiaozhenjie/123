package p167;

public class Ball implements Round {
	private double radius;
	Ball(){
		radius=1;
	}
	Ball(double r){
		if(r<0){
			System.out.println("构造方法中提示：r<0，无法构成圆球。");
		}
		radius=r;
	}
	public void setRadius(double r){
		radius=r;
	}
	public double getRadius(){
		return radius;
	}
	public double getSuperficialArea() {
		if(radius<0){
			System.out.println("圆球的半径小于0，无法计算表面积。");
			return 0;
		}else{
			return 4*PI*radius*radius;
		}
	}

	public double getVolume() {
		if(radius<0){
			System.out.println("圆球的半径小于0，无法计算体积。");
			return 0;
		}else{
			return 4*PI*radius*radius*radius/3;
		}
	}
	public String printInfo(){
		String s="【圆球】 半径 = "+radius;
		if(getSuperficialArea()!=0){
			s+="，表面积 = "+getSuperficialArea();
		}
		if(getVolume()!=0){
			s+="，体积 = "+getVolume();
		}
		return s;
	}

}
