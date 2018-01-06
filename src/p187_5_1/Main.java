package p187_5_1;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Pyramid p=new Pyramid();
		System.out.println("三棱锥的表面积为："+keepNum(p.pyramid(10, 8, 9, 6)));
		Volume v=new Volume();
		System.out.println("三棱锥的体积为："+keepNum(v.pyramid(10, 8, 9, 6)));

	}
	public static String keepNum(double x){
		DecimalFormat df=new DecimalFormat("#.###");
		return df.format(x);
		
	}

}
