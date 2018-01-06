package 包装器类Character类;

public class digit方法 {

	public static void main(String[] args) {
		//格式错误返回-1
		System.out.println("Character.MIN_RADIX:"+Character.MIN_RADIX);
		System.out.println("Character.MAX_RADIX:"+Character.MAX_RADIX);
		System.out.println("Character.digit('2',2):"+Character.digit('2', 2));
		System.out.println("Character.digit('7',10):"+Character.digit('7',10));
		System.out.println("Character.digit('F',16):"+Character.digit('F',16));
	}

}
