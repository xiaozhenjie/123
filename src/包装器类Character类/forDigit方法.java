package ��װ����Character��;

public class forDigit���� {

	public static void main(String[] args) {
		//forDigit ����Ϊ digit ������������                         ��ʽ���󷵻�'\u0000'
		System.out.println("\u0000");
		System.out.println("Character.MIN_RADIX:"+Character.MIN_RADIX);
		System.out.println("Character.MAX_RADIX:"+Character.MAX_RADIX);
		System.out.println("Character.forDigit(2,2):"+Character.forDigit(2, 2));
		System.out.println("Character.forDigit(7,10):"+Character.forDigit(7, 10));
		System.out.println("Character.forDigit(15,16):"+Character.forDigit(18,36));

	}

}
