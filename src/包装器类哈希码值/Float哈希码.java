package 包装器类哈希码值;

public class Float哈希码 {

	public static void main(String[] args) {
		Float f1=new Float(23.23f);
		Float f2=new Float(23.23f);
		System.out.println("f1.hashCode()="+f1.hashCode());
		System.out.println("f2.hashCode()="+f2.hashCode());
		System.out.println("f1.equals(f2)="+f1.equals(f2));
	}

}
