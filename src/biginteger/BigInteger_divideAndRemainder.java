package biginteger;

import java.math.BigInteger;

public class BigInteger_divideAndRemainder {

	public static void main(String[] args) {//整数商+余数   0表示整数商  1表示余
		BigInteger b1=new BigInteger("34");
		BigInteger b2=new BigInteger("5");
		System.out.println("b1.divide(b2)="+b1.divide(b2));//整数商
		System.out.println("b1.remainder(b2)="+b1.remainder(b2));//余数
		System.out.println("b1.divideAndRemainder(b2)[0]="+b1.divideAndRemainder(b2)[0]);//整数商
		System.out.println("b1.divideAndRemainder(b2)[1]="+b1.divideAndRemainder(b2)[1]);//余数
	}

}
