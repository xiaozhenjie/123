package 包装器类哈希码值;

public class Integer哈希码 {

	public static void main(String[] args) {
		Integer i1=new Integer(23);
		Integer i2=new Integer(23);
		System.out.println("i1.hashCode()="+i1.hashCode());
		System.out.println("i2.hashCode()="+i2.hashCode());
		System.out.println("i1.equals(i2)="+i1.equals(i2));
	}

}
