package 包装器类;

public class 构造方法 {

	public static void main(String[] args) {
		Integer x=new Integer(23);//要构建的基本类型为参数
		Integer y=new Integer("23");//字符串参数
		System.out.println(x.equals(y));
	}

}
