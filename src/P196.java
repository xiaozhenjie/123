import java.math.BigDecimal;

public class P196 {

	public static void main(String[] args) {
		double d;
		long l;
		int i;
		float f;
		BigDecimal d1=new BigDecimal("-2-312324322321".toCharArray(),2,7);
		System.out.println("d1="+d1+"   d1�ľ���ֵΪ��"+d1.abs());
		d=d1.doubleValue();
		l=d1.longValue();
		i=d1.intValue();
		f=d1.floatValue();
		System.out.println("d1��double����Ϊ��"+d);
		System.out.println("d1��long����Ϊ��"+l);
		System.out.println("d1��int����Ϊ��"+i);
		System.out.println("d1��float����Ϊ��"+f);
	}

}
