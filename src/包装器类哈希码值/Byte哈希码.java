package 包装器类哈希码值;

public class Byte哈希码 {

	public static void main(String[] args) {
		Byte b1=new Byte((byte)2);
		Byte b2=new Byte((byte)2);
		System.out.println("b1.hashCode()="+b1.hashCode());
		System.out.println("b2.hashCode()="+b2.hashCode());
		System.out.println("b1.equals(b2)="+b1.equals(b2));
	}

}
