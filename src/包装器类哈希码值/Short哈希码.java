package 包装器类哈希码值;

public class Short哈希码 {

	public static void main(String[] args) {
		Short s1=new Short((short)32);
		Short s2=new Short((short)32);
		System.out.println("s1.hashCode()="+s1.hashCode());
		System.out.println("s2.hashCode()="+s2.hashCode());
		System.out.println("s1.equals(s2)="+s1.equals(s2));
	}

}
