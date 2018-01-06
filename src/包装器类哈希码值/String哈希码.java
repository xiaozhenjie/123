package 包装器类哈希码值;

public class String哈希码 {

	public static void main(String[] args) {
		String str1=new String("231");
		String str2=new String("231");
		System.out.println("str1.hashCode()="+str1.hashCode());
		System.out.println("str2.hsahCode()="+str2.hashCode());
		System.out.println("str1.equals(str2)="+str1.equals(str2));
	}

}
