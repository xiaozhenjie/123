package p167;

public class Ball implements Round {
	private double radius;
	Ball(){
		radius=1;
	}
	Ball(double r){
		if(r<0){
			System.out.println("���췽������ʾ��r<0���޷�����Բ��");
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
			System.out.println("Բ��İ뾶С��0���޷�����������");
			return 0;
		}else{
			return 4*PI*radius*radius;
		}
	}

	public double getVolume() {
		if(radius<0){
			System.out.println("Բ��İ뾶С��0���޷����������");
			return 0;
		}else{
			return 4*PI*radius*radius*radius/3;
		}
	}
	public String printInfo(){
		String s="��Բ�� �뾶 = "+radius;
		if(getSuperficialArea()!=0){
			s+="������� = "+getSuperficialArea();
		}
		if(getVolume()!=0){
			s+="����� = "+getVolume();
		}
		return s;
	}

}
