package biginteger;

import java.math.BigInteger;

public class BigInteger_remainder {

	public static void main(String[] args) {
		BigInteger b1=new BigInteger("34");
		BigInteger b2=new BigInteger("5");
		System.out.println(b1.remainder(b2));//����
		System.out.println(b2.remainder(b1));

	}

}
