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
		String s="��Բ�Ρ�  �뾶 ="+r+"��\t�������ͣ�"+getLinestyle()+"��\t��ɫ��";
		if(isColor()){
			s+="��ɫ";
		}else{
			s+="��ɫ";
		}
		return s;
	}
}
