package 包装器类哈希码值;

public class Character哈希码 {

	public static void main(String[] args) {
		Character c1=new Character('A');
		Character c2=new Character('A');
		System.out.println("c1.hashCode()="+c1.hashCode());
		System.out.println("c2.hashCode()="+c2.hashCode());
		System.out.println("c1.equals(c2)="+c1.equals(c2));

	}

}
