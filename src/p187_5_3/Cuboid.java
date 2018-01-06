package p187_5_3;

public class Cuboid implements Superficial,Volume{
	private double length;
	private double width;
	private double height;
	Cuboid(){
		length=1;
		width=1;
		height=1;
	}
	Cuboid(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void setLength(double length){
		this.length=length;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public double getSuperficial(){
		return 2*(width*length+width*height+width*length);
	}
	public double getVolume(){
		return width*height*length;
	}
}
