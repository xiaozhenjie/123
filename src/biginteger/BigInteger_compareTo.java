package biginteger;

import java.math.BigInteger;

public class BigInteger_compareTo {

	public static void main(String[] args) {
		BigInteger b1=new BigInteger("231");
		BigInteger b2=new BigInteger("213");//�Ƚϴ�С   ���ڷ�������  ���ڷ���0 С�ڷ��ظ���
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
