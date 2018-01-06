package biginteger;

import java.math.BigInteger;

public class BigInteger_valueOf {

	public static void main(String[] args) {
		BigInteger b1=new BigInteger("234214");
		System.out.println(b1);
		int a=3;
		BigInteger b2=BigInteger.valueOf(a);//value(long ) 可以为int 其他不能
		System.out.println(b2);
		//String str="31231";
		//BigInteger b3=BigInteger.value(str);
		
		
	}

}
