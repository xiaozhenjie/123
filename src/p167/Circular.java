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
			System.out.println("���췽����ʾ���а뾶���С��0���޷�����Բ̨��");
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
			System.out.println("�а뾶���С��0���޷�����������");
			return 0;
		}else{
			return PI*(r1*r1+r2*r2+r1*getL()+r2*getL());
		}
	}
	public double getVolume(){
		if(r1<0||r2<0||height<0){
			System.out.println("�а뾶���С��0���޷����������");
			return 0;
		}else{
			return PI*height*(r1*r1+r2*r2+r1*r2)/3;
		}
	}
	public String printInfo(){
		String s="��Բ̨�������뾶 = "+r1+"���ײ��뾶 = "+r2+"���� = "+height;
		if(getSuperficialArea()!=0){
			s+="������� = "+getSuperficialArea();
		}
		if(getVolume()!=0){
			s+="����� = "+getVolume();
		}
		return s;
	}
}
