package biginteger;

import java.math.BigInteger;

public class BigInteger_divide {

	public static void main(String[] args) {
		BigInteger b1=new BigInteger("34");
		BigInteger b2=new BigInteger("5");
		System.out.println(b1.divide(b2));//ÕûÊıÉÌ
		System.out.println(b2.divide(b1));
		System.out.println(b1.divide(b2));

	}

}
