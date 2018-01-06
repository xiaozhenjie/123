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
			System.out.println("���췽����ʾ���а뾶���С��0���޷�����Բ׶��");
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
			System.out.println("�а뾶���С��0���޷�����������");
			return 0;
		}else{
			return PI*radius*getL()+PI*radius*radius;
		}
	}
	public double getVolume(){
		if(radius<0||height<0){
			System.out.println("�а뾶���С��0���޷����������");
			return 0;
		}else{
			return PI*radius*radius*height/3;
		}
	}
	public String printInfo(){
		String s="��Բ׶�� �뾶 = "+radius+"���� = "+height;
		if(getSuperficialArea()!=0){
			s+="������� = "+getSuperficialArea();
		}
		if(getVolume()!=0){
			s+="����� = "+getVolume();
		}
		return s;
	}
}
