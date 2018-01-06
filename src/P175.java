
public class P175 {

	int aVar=10;
	class Inner{
		int innerBVar;
		Inner(){
			innerBVar=1000;
		}
		public void callOuter(){
			System.out.print("在内部类对象访问的成员方法中访问，");
			innerBVar+=aVar;
			System.out.println("外部类成员变量aVar="+aVar+"，内部类的成员变量innerBVar="+innerBVar);
		}
	}
	public void printVar(){
		Inner inObj =new Inner();
		System.out.print("在外部类中访问内部类的变量，");
		System.out.println("innerBVar="+inObj.innerBVar);
		inObj.callOuter();
	}
	public static void main(String[] args) {
		P175 p=new P175();
		p.printVar();

	}

}
