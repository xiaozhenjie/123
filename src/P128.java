import java.util.Scanner;
class Rectangle{
	double length;
	double width;
	double height;
	double s;
	double v;
	Rectangle(){
		length=1000.583d;
		width=350.897d;
		height=340.436d;
		System.out.println("��Ĭ�ϡ� �����εĳ���"+length+"����"+width+"���ߣ�"+height+"\t");
	}
	Rectangle(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
		System.out.println("�����롿 �����εĳ���"+length+"����"+width+"���ߣ�"+height+"\t");
	}
	public double area(){
		s=2*(width*length+width*height+length*height);
		return s;
	}
	public double area(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
		s=2*(width*length+width*height+height*length);
		return s;
	}
	public double volume(){
		v=length*width*height;
		return v;
	}
	public double volume(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
		v=length*width*height;
		return v;
	}
	
}
public class P128 {
	public static void main(String[] args) {
		double length;
		double width;
		double height;
		Scanner sc=new Scanner(System.in);
		Rectangle rect=new Rectangle();
		System.out.print("������ı����Ϊ��"+rect.area()+",\t");
		System.out.println("�����"+rect.volume());
		System.out.print("�����볤����ĳ���");
		length=sc.nextDouble();
		System.out.print("�����볤����Ŀ�");
		width=sc.nextDouble();
		System.out.print("�����볤����ĸߣ�");
		height=sc.nextDouble();
		rect=new Rectangle(length,width,height);
		System.out.print("������ı����Ϊ��"+rect.area()+",\t");
		System.out.println("�����"+rect.volume());
		System.out.println("�����û���������ݣ������в����ı���������������������");
		System.out.print("������ı����Ϊ��"+rect.area(length,width,height)+",\t");
		System.out.println("�����"+rect.volume(length,width,height));
	}

}
