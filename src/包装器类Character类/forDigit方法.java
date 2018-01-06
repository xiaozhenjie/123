package 包装器类Character类;

public class forDigit方法 {

	public static void main(String[] args) {
		//forDigit 方法为 digit 方法的逆运算                         格式错误返回'\u0000'
		System.out.println("\u0000");
		System.out.println("Character.MIN_RADIX:"+Character.MIN_RADIX);
		System.out.println("Character.MAX_RADIX:"+Character.MAX_RADIX);
		System.out.println("Character.forDigit(2,2):"+Character.forDigit(2, 2));
		System.out.println("Character.forDigit(7,10):"+Character.forDigit(7, 10));
		System.out.println("Character.forDigit(15,16):"+Character.forDigit(18,36));

	}

}
