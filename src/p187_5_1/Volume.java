package p187_5_1;

public class Volume {    
	public double pyramid(double a,double b,double c,double h){//a,b,cΪ����׶�ĵ������ ��hΪ��   
		double p,s,v;
		p=(a+b+c)/2;
		s=Math.sqrt(p*(p-a)*(p-b)*(p-c));//�����
		v=s*h/3;
		return v;
	}
	public double cuboid(double length,double width,double height){//������ĳ�������
		return length*width*height;
	}
}
