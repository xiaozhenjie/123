package p187_5_1;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Pyramid p=new Pyramid();
		System.out.println("����׶�ı����Ϊ��"+keepNum(p.pyramid(10, 8, 9, 6)));
		Volume v=new Volume();
		System.out.println("����׶�����Ϊ��"+keepNum(v.pyramid(10, 8, 9, 6)));

	}
	public static String keepNum(double x){
		DecimalFormat df=new DecimalFormat("#.###");
		return df.format(x);
		
	}

}
