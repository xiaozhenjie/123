package comd;

public abstract class Geometries {
	protected String linestyle;
	protected boolean iscolor;
	Geometries(){
		linestyle="Ï¸Ïß";
		iscolor=false;
	}
	Geometries(String linestyle,boolean iscolor){
		this.linestyle=linestyle;
		this.iscolor=iscolor;
	}
	public void setLinestyle(String linestyle){
		this.linestyle=linestyle;
	}
	public void setFilled(boolean filled){
		this.iscolor=filled;
	}
	public String getLinestyle(){
		return linestyle;
	}
	public boolean isColor(){
		return iscolor;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String printInfo();
}
