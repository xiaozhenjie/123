class Person1{
	double id=0;
	String name="";
	char sex=' ';
	int age = 0;
	char isBin=' ';
	float height=0.0f;
	float weight=0.0f;
	String home="";
	public void speak(String inStr){
		System.out.println(inStr+"，我叫"+name+",今年"+age+"岁,身份证号是："+id+"性别："+sex+",身高："+height+"cm，体重："+weight+"斤，是否服兵役："+isBin);
	}
	
}
public class P112 {

	public static void main(String[] args) {
		Person1 p=new Person1();
		p.name="张三";
		p.id=222231231234124093d;
		p.age=18;
		p.sex='男';
		p.isBin='是';
		p.height=170f;
		p.weight=100f;
		p.home="江西赣州";
		p.speak("大家好");
	}

}
