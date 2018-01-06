package comd;

public class Ring extends Round{
	protected double r1; 
	Ring(){
		super();
		r1=0.5;
	}
	Ring(String linestyle,boolean iscolor,double r,double r1){
		super(linestyle,iscolor,r);
		this.r1=r1;
	}
	public void setR1(double r1){
		this.r1=r1;
	}
	public double getR1(){
		return r1;
	}
	public double getArea(){
		return 2*Math.PI*(r-r1);
	}
	public double getRPerimeter(){
		return 2*Math.PI*r;
	}
	public double getR1Perimeter(){
		return 2*Math.PI*r1;
	}
	public String printInfo(){
		String s="��Բ����  ��Բ�뾶 ="+r+"��\t��Բ�뾶 ="+r1+"��\t�������ͣ�"+getLinestyle()+"��\t��ɫ��";
		if(isColor()){
			s+="��ɫ";
		}else{
			s+="��ɫ";
		}
		return s;
	}
}
