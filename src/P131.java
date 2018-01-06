class AStaticVarClass{
	static int num1=100;
	static String str="张三";
	int num2=100;
	float num3=100;
}
class BStaticVarClass{
	static int num1=30;
	static String str="你好";
}
public class P131 {

	public static void main(String[] args) {
		System.out.println("AStaticVarClass中类变量的调用：AStaticVarClass.num1="+AStaticVarClass.num1+",AStaticVarClass.str="+AStaticVarClass.str);
		System.out.println("BStaticVarClass中类变量的调用：BStaticVarClass.num1="+BStaticVarClass.num1+",BStaticVarClass.str="+BStaticVarClass.str);
		AStaticVarClass a1=new AStaticVarClass();
		AStaticVarClass a2=new AStaticVarClass();
		a1.num1+=100;
		a1.num2+=30;
		a1.num3+=50;
		a1.str="李四";
		System.out.println("a1.num1+=100;运行后 a1.num1="+a1.num1);
		System.out.println("a1.num2+=30;运行后 a1.num2="+a1.num2);
		System.out.println("a1.num3+=50;运行后 a1.num3="+a1.num3);
		System.out.println("a1.str=\"李四\"；运行后a1.str="+a1.str);
		System.out.println("a1.num1+=100;运行后 a2.num1="+a2.num1);
		System.out.println("a1.num2+=30;运行后 a2.num2="+a2.num2);
		System.out.println("a1.num3+=50;运行后 a2.num3="+a2.num3);
		System.out.println("a1.str=\"李四\"；运行后 a2.str="+a2.str);
		
	}

}
