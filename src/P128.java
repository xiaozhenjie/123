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
		System.out.println("【默认】 长方形的长："+length+"，宽："+width+"，高："+height+"\t");
	}
	Rectangle(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
		System.out.println("【输入】 长方形的长："+length+"，宽："+width+"，高："+height+"\t");
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
		System.out.print("长方体的表面积为："+rect.area()+",\t");
		System.out.println("体积："+rect.volume());
		System.out.print("请输入长方体的长：");
		length=sc.nextDouble();
		System.out.print("请输入长方体的宽：");
		width=sc.nextDouble();
		System.out.print("请输入长方体的高：");
		height=sc.nextDouble();
		rect=new Rectangle(length,width,height);
		System.out.print("长方体的表面积为："+rect.area()+",\t");
		System.out.println("体积："+rect.volume());
		System.out.println("根据用户输入的数据，调用有参数的表面积、体积方法计算结果：");
		System.out.print("长方体的表面积为："+rect.area(length,width,height)+",\t");
		System.out.println("体积："+rect.volume(length,width,height));
	}

}
