class Animal{
	public void getEat(){
		System.out.println("******动物吃******");
	}
	public void getRun(){
		System.out.println("******动物运动*******");
	}
}
class Shizi extends Animal{
	public void getEat(){
		System.out.println("狮子吃：兔子");
	}
	public void getRun(){
		System.out.println("狮子运动： 跑");
	}
}
class Meihualu extends Animal{
	public void getEat(){
		System.out.println("梅花鹿吃：树叶");
	}
	public void getRun(){
		System.out.println("梅花鹿运动：散步");
	}
}
class Banma extends Animal{
	public void getEat(){
		System.out.println("斑马吃：草");
	}
	public void getRun(){
		System.out.println("斑马运动：跑步");
	}
}
class Zongxiong extends Animal{
	public void getEat(){
		System.out.println("棕熊吃：肉");
	}
	public void getRun(){
		System.out.println("棕熊运动：爬");
	}
}
class Liyu extends Animal{
	public void getEat(){
		System.out.println("鲤鱼吃：水草和虫子");
	}
	public void getRun(){
		System.out.println("鲤鱼运动：水里游");
	}
}
class Laoying extends Animal{
	public void getEat(){
		System.out.println("老鹰吃：小鸡");
	}
	public void getRun(){
		System.out.println("老鹰运动：高空飞翔");
	}
}
class Maque extends Animal{
	public void getEat(){
		System.out.println("麻雀吃：树上的虫");
	}
	public void getRun(){
		System.out.println("麻雀运动：低空飞翔");
	}
}
public class P151 {

	public static void main(String[] args) {
		Animal animal=new Animal();
		Shizi shizi=new Shizi();
		Meihualu meihualu=new Meihualu();
		Banma banma=new Banma();
		Zongxiong zongxiong=new Zongxiong();
		Liyu liyu=new Liyu();
		Laoying laoying=new Laoying();
		Maque maque=new Maque();
		printAnimalEatInof(animal);
		printAnimalEatInof(shizi);
		printAnimalEatInof(meihualu);
		printAnimalEatInof(banma);
		printAnimalEatInof(zongxiong);
		printAnimalEatInof(liyu);
		printAnimalEatInof(laoying);
		printAnimalEatInof(maque);
		
		printAnimalRunInof(animal);
		printAnimalRunInof(shizi);
		printAnimalRunInof(meihualu);
		printAnimalRunInof(banma);
		printAnimalRunInof(zongxiong);
		printAnimalRunInof(liyu);
		printAnimalRunInof(laoying);
		printAnimalRunInof(maque);
		
	}
	public static void printAnimalEatInof(Animal obj){
		obj.getEat();
	}
	public static void printAnimalRunInof(Animal obj){
		obj.getRun();
	}

}
