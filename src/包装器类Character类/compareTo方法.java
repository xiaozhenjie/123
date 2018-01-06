package 包装器类Character类;

public class compareTo方法 {

	public static void main(String[] args) { 
		Character c1 = new Character('d');  
		Character c2 = new Character('a');
		
		//返回   c1-c2 对应的ASCII码表值        c1>c2 返回正数   c1=c2返回0  c1<c2返回负数
		System.out.println(c1.compareTo(c2));

	}

}
