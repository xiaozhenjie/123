package p187_5_1;

public class Pyramid extends Volume{
	public double pyramid(double a,double b,double c,double h){
		double p1,p2,p3,p4,s1,s2,s3,s4,s;
		p1=(a+b+c)/2;
		s1=Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
		p2=(a+b+h)/2;
		s2=Math.sqrt(p2*(p2-a)*(p2-b)*(p2-h));
		p3=(a+h+c)/2;
		s3=Math.sqrt(p3*(p3-a)*(p3-h)*(p3-c));
		p4=(h+b+c)/2;
		s4=Math.sqrt(p4*(p4-h)*(p4-b)*(p4-c));
		s=s1+s2+s3+s4;
		return s;
	}
}
