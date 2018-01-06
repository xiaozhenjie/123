package p187_5_1;

public class Volume {    
	public double pyramid(double a,double b,double c,double h){//a,b,c为三棱锥的底面面积 ，h为高   
		double p,s,v;
		p=(a+b+c)/2;
		s=Math.sqrt(p*(p-a)*(p-b)*(p-c));//底面积
		v=s*h/3;
		return v;
	}
	public double cuboid(double length,double width,double height){//长方体的长，宽，高
		return length*width*height;
	}
}
