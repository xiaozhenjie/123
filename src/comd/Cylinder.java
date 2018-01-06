package comd;

public class Cylinder extends Round{
	protected double h;
	Cylinder(){
		super();
		h=1;
	}
	Cylinder(double h){
		this("����",true,3.0d,h);
	}
	Cylinder(String linestyle,boolean iscolor,double r,double h){
		super(linestyle,iscolor,r);
		this.h=h;
	}
	public void setH(double h){
		this.h=h;
	}
	public double getH(){
		return h;
	}
	public double getSuperficialArea(){          //����Բ�����������
		return 2*Math.PI*r*(h+r);
	}
	public double getVolume(){
		return Math.PI*r*r*h;
	}
	public String printInfo(){
		String s="��Բ����  �뾶 ="+r+" ��\t�� ="+h+"��          \t�������ͣ�"+getLinestyle()+"��\t��ɫ��";
		if(isColor()){
			s+="��ɫ";
		}else{
			s+="��ɫ";
		}
		return s;
	}
}
