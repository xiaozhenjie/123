package comd;

import java.text.DecimalFormat;

public class P160 {

	public static void main(String[] args) {
		Round round1=new Round();
		displayGeometriesObject("ʹ���޲ι��췽������Բ�ζ���round1��",round1);
		round1.setR(3);
		displayGeometriesObject("����ԭ�Ͷ���round1��setter()������",round1);		
		Round round2=new Round("����",true,4.0d);
		displayGeometriesObject("ʹ���вι��췽������Բ�ζ���round2��",round2);
		Cylinder cylinder1=new Cylinder();
		displayGeometriesObject("ʹ���޲ι��췽������Բ���ζ���cylinder1��",cylinder1);
		Round cylinder2=new Cylinder(10);
		displayGeometriesObject("ʹ��Round������������Բ�������cylinder2��",cylinder2);//�����������ܳ�  ��Ӧʹ��
		Cylinder cylinder3=new Cylinder("����",false,5.0,8.0);
		displayGeometriesObject("ʹ���вι��췽������Բ���ζ���cylinder3��",cylinder3);
		Ring ring1=new Ring();
		displayGeometriesObject("ʹ���޲ι��췽������Բ������ring1��",ring1);
		Ring ring2=new Ring("ϸ��",true,6,4);
		displayGeometriesObject("ʹ���вι��췽������Բ������ring2��",ring2);
		Circular circular1=new Circular();
		displayGeometriesObject("ʹ���޲ι��췽������Բ�ܶ���circular1��",circular1);
		System.out.println(circular1.printInfo());
		System.out.println("�������"+keepNum(circular1.getSuperficialArea())+"��\t�����"+keepNum(circular1.getVolume()));
		Circular circular2=new Circular("����",true,8,6,10);
		displayGeometriesObject("ʹ���вι��췽������Բ�ܶ���circular2��",circular2);
		System.out.println(circular2.printInfo());
		System.out.println("�������"+keepNum(circular2.getSuperficialArea())+"��\t�����"+keepNum(circular2.getVolume()));
		

	}
	//Բ��
	public static void displayGeometriesObject(String s,Geometries obj){
		System.out.println(s);
		System.out.println(obj.printInfo());
		System.out.print("�����"+keepNum(obj.getArea())+"\t");
		System.out.println("�ܳ���"+keepNum(obj.getPerimeter())+"\t");
	}
	//Բ��
	public static void displayGeometriesObject(String s,Cylinder obj){
		System.out.println(s);
		System.out.println(obj.printInfo());
		System.out.print("�������"+keepNum(obj.getSuperficialArea())+"\t");
		System.out.println("�����"+keepNum(obj.getVolume())+"\t");
	}
	//Բ��
	public static void displayGeometriesObject(String s,Ring obj){
		System.out.println(s);
		System.out.println(obj.printInfo());
		System.out.print("�����"+keepNum(obj.getArea())+"\t");
		System.out.print("��Բ�ܳ���"+keepNum(obj.getR1Perimeter())+"\t");
		System.out.println("��Բ�ܳ���"+keepNum(obj.getRPerimeter())+"\t");
	}
	//Բ��
	public static void displayGeometriesObject(String s,Circular obj){
		System.out.println(s);
		System.out.println(obj.printInfo());
		System.out.print("�������"+keepNum(obj.getSuperficialArea())+"\t");
		System.out.println("�����"+keepNum(obj.getVolume())+"\t");
	}
	public static String keepNum(double x){
		DecimalFormat df=new DecimalFormat("#.###");
		return df.format(x);
	}

}
