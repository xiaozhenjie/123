//声明接口Run
interface Run{
	//接口中声明的方法
    void run();
}
//声明接口Animal,并继承接口Run
interface Animal extends Run{
	//接口中新声明的方法shout
	//又因为继承了Run接口，所以，该Animal接口包括两个方法:run和shout
	void shout();
}
//声明Bird类，实现接口方法run和shout
class Bird implements Animal{
	public void run(){
		System.out.println("我是鸟儿，用两只细细的小脚走路。");
	}
	public void shout(){
		System.out.println("我是鸟儿，叫声叽叽咋咋。");
	}
}
//声明Tiger类，实现接口方法run和shout
class Tiger implements Animal{
	public void run(){
		System.out.println("我是老虎，用四肢走四方。");
	}
	public void shout(){
		System.out.println("我是老虎，叫声凶狠，高昂生威。");
	}
}
//声明测试类AnimalDemo，方法一：
public class AnimalDemo {
      //实现方法一：
	public static void main(String []args){
		//声明接口对象
		Animal animal = null;
		//用接口实现类Bird创建实体，并赋给接口对象animal
		animal = new Bird(); 
		//JVM运行时，接口对象自动调用实现类对象中的run和shout方法，实现多态
		animal.run();
		animal.shout();
		//用接口实现类Tiger创建实体，并赋给接口对象animal
		animal = new Tiger();
		//JVM运行时，接口对象自动调用实现类对象中的run和shout方法，实现多态
		animal.run();
		animal.shout();  
	} 
}
