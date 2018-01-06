package p187_5_3;

public class Round implements Area,Perimeter{
	private double radius;
	Round(){
		radius=1;
	}
	Round(double radius){
		this.radius=radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
}
