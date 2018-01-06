package biginteger;

import java.math.BigInteger;

public class BigInteger_compareTo {

	public static void main(String[] args) {
		BigInteger b1=new BigInteger("231");
		BigInteger b2=new BigInteger("213");//比较大小   大于返回正数  等于返回0 小于返回负数
		if(b1.compareTo(b2)>0){
			System.out.println("231>213");
		}else if(b1.compareTo(b2)==0){
			System.out.println("231=213");
		}else{
			System.out.println("231<213");
		}
		System.out.println(b1.compareTo(b2));
	}

}
