package p187_5_3;

import java.text.DecimalFormat;

public class P187 {

	public static void main(String[] args) {
		Round r1=new Round();//Բ
		System.out.println("��Ĭ�ϡ�Բ�İ뾶Ϊ��"+r1.getRadius()+"�����Ϊ��"+keepNum(r1.getArea(),4)+"���ܳ�Ϊ��"+keepNum(r1.getPerimeter(),3));
		Round r2=new Round(5.4);
		System.out.println("���вΡ�Բ�İ뾶Ϊ��"+r2.getRadius()+"�����Ϊ��"+keepNum(r2.getArea(),4)+"���ܳ�Ϊ��"+keepNum(r2.getPerimeter(),3));
		Cuboid c1=new Cuboid();//������
		System.out.println("��Ĭ�ϡ�������ı߳��ֱ�Ϊ��"+c1.getLength()+"��"+c1.getWidth()+"��"+c1.getHeight()+"�������Ϊ��"+keepNum(c1.getSuperficial(),4)+"�����Ϊ��"+keepNum(c1.getVolume(),4));
		Cuboid c2=new Cuboid(4,5,5);
		System.out.println("���вΡ�������ı߳��ֱ�Ϊ��"+c2.getLength()+"��"+c2.getWidth()+"��"+c2.getHeight()+"�������Ϊ��"+keepNum(c2.getSuperficial(),4)+"�����Ϊ��"+keepNum(c2.getVolume(),4));
	}
	public static String keepNum(double x,int n){
		String str="#.";
		for(int i=0;i<n;i++){
			str+="#";
		}
		DecimalFormat df=new DecimalFormat(str);
		return df.format(x);
	}
}
