package com;
class Triangle{
	double length1;
	double length2;
	double length3;
	public Triangle(){
		length1=1;
		length2=1;
		length3=1;
	}
	public Triangle(double length1,double length2,double length3){
		this.length1=length1;
		this.length2=length2;
		this.length3=length3;
		if(!isEstablish(length1,length2,length3)){
			System.out.print("�������䲻�ܹ��������Σ������˳���");
			System.exit(0);
		}
	}
	public double getTriangleLength1(){
		return length1;
	}
	public double getTriangleLength2(){
		return length2;
	}
	public double getTriangleLength3(){
		return length3;
	}
	public double getTrianglePerimeter(){
		return length1+length2+length3;
	}
	public double getTriangleArea(){
		double s=0.5*getTrianglePerimeter();
		return Math.sqrt((s-length1)*(s-length2)*(s-length3));
	}
	public boolean isEstablish(double length1,double length2,double length3){
		if(2*getMax(length1,length2,length3)-length1-length2-length3<0){
			return true;
		}else{
			return false;
		}
	}
	public double getMax(double length1,double length2,double length3){
		double max;
		if(length1>length2){
			max=length1;
		}else{
			max=length2;
		}
		if(max>length3){
			return max;
		}else{
			return length3;
		}
	}

}
class Rectangle{
	double length;
	double width;
	Rectangle(){
		length=1;
		width=1;
	}
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	public double getRectangleLength(){
		return length;
	}
	public double getRectangleWidth(){
		return width;
	}
	public double getRectanglePerimeter(){
		return length+width;
	}
	public double getRectangleArea(){
		return width*length;
	}
}
public class P134_4_1 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		System.out.println("��Ĭ�ϡ������εĳ��Ϳ�Ϊ��"+r1.getRectangleLength()+",  "+r1.getRectangleWidth()+", ���Ϊ��"+r1.getRectangleArea()+",�ܳ�Ϊ��"+r1.getRectanglePerimeter());
		Triangle t1=new Triangle();
		System.out.println("��Ĭ�ϡ������ε������߷ֱ�Ϊ��"+t1.getTriangleLength1()+",  "+t1.getTriangleLength2()+",   "+t1.getTriangleLength3()+",���Ϊ��"+t1.getTriangleArea()+",�ܳ�Ϊ��"+t1.getTrianglePerimeter());
		Triangle t2=new Triangle(3.4,2.3,5.3);
		System.out.println("�����롿�����ε������߷ֱ�Ϊ��"+t2.getTriangleLength1()+",  "+t2.getTriangleLength2()+",   "+t2.getTriangleLength3()+",���Ϊ��"+t2.getTriangleArea()+",�ܳ�Ϊ��"+t2.getTrianglePerimeter());
		Triangle t3=new Triangle(13.4,2.3,5.3);
		System.out.println("�����롿�����ε������߷ֱ�Ϊ��"+t3.getTriangleLength1()+",  "+t3.getTriangleLength2()+",   "+t3.getTriangleLength3()+",���Ϊ��"+t3.getTriangleArea()+",�ܳ�Ϊ��"+t3.getTrianglePerimeter());
		
	}

}
