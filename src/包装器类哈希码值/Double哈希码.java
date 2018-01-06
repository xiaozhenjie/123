package 包装器类哈希码值;

public class Double哈希码 {

	public static void main(String[] args) {
		Double d1=new Double(23.23d);
		Double d2=new Double(23.23d);
		System.out.println("d1.hashCode()="+d1.hashCode());
		System.out.println("d2.hashCode()="+d2.hashCode());
		System.out.println("d1.equals(d2)="+d1.equals(d2));
	}

}
