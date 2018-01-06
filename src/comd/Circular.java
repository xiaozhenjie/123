package comd;

public class Circular extends Ring{
	protected double length;
	Circular(){
		super();
		length=3;
	}
	Circular(double length){
		this("����",true,10.0d,8.0d,length);
	}
	Circular(String linestyle,boolean iscolor,double r,double r1,double length){
		super(linestyle,iscolor,r,r1);
		this.length=length;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double getLength(){
		return length;
	}
	public double getSuperficialArea(){
		return 2*Math.PI*length*(r+r1)+2*super.getArea();
	}
	public double getVolume(){
		return Math.PI*length*(r*r-r1*r1);
	}
	public String printInfo(){
		String s="��Բ�ܡ�  ��Բ�뾶 ="+r+"��\t��Բ�뾶 = "+r1+"��\tԲ�ܳ��� = "+length+"��\t�������ͣ�"+getLinestyle()+",��ɫ��";
		if(isColor()){
			s+="��ɫ";
		}else{
			s+="��ɫ";
		}
		return s;
	}
}
