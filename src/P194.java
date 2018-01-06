import java.math.BigInteger;

public class P194 {

	public static void main(String[] args) {
		float x;
		double y;
		BigInteger b1=new BigInteger("2223");
		System.out.println(b1.hashCode());
		x=b1.floatValue();
		System.out.println(x);
		y=b1.doubleValue();
		System.out.println(y);
		
	}

}
