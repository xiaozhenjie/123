class Person2{
	double id=0.0d;
	String name="";
	char sex=' ';
	int age=0;
	float height=0.0f;
	float weight=0.0f;
	char xuexin=' ';
	boolean isJiehun = false;
	boolean isBin = false;
	String home="";
	public void speak(){
		String x="";
		String y="";
		
		if(isBin){
			x="服过兵役,";
		}else{
			x="未服兵役,";
		}
		
		if(isJiehun){
			y="已结婚。";
		}else{
			y="未结婚。";
		}
		
		System.out.println("我叫"+name+",我的身份证号是："+id+",性别"+sex+"，今年"+age+"岁，身高"+height+"米，体重"+weight+"公斤，血型为"+xuexin+"型，"+x+y);
	}
	public void jiSuan(float height,float weight){
		double b=0.0d;
		String jieguo=" ";
		this.height=height;
		this.weight=weight;
		b=weight/height/height;
		if(b>=18&&b<25){
			jieguo="正常体重";
		}else if(b<30){
			jieguo="超重";
		}else if(b<35){
			jieguo="轻度肥胖";
		}else if(b<40){
			jieguo="中度肥胖";
		}else{
			jieguo="重度肥胖";
		}
		System.out.println("计算结果为："+jieguo);
	}
}
public class P118 {

	public static void main(String[] args) {
		Person2 p=new Person2();
		p.id=1312321312312d;
		p.name="张三";
		p.sex='男';
		p.age=19;
		p.height=1.70f;
		p.weight=56.3f;
		p.xuexin='o';
		p.isBin=true;
		p.isJiehun=false;
		p.home="江西赣州";
		p.speak();
		p.jiSuan(p.height, p.weight);

	}

}
