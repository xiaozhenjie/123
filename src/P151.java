class Animal{
	public void getEat(){
		System.out.println("******�����******");
	}
	public void getRun(){
		System.out.println("******�����˶�*******");
	}
}
class Shizi extends Animal{
	public void getEat(){
		System.out.println("ʨ�ӳԣ�����");
	}
	public void getRun(){
		System.out.println("ʨ���˶��� ��");
	}
}
class Meihualu extends Animal{
	public void getEat(){
		System.out.println("÷��¹�ԣ���Ҷ");
	}
	public void getRun(){
		System.out.println("÷��¹�˶���ɢ��");
	}
}
class Banma extends Animal{
	public void getEat(){
		System.out.println("����ԣ���");
	}
	public void getRun(){
		System.out.println("�����˶����ܲ�");
	}
}
class Zongxiong extends Animal{
	public void getEat(){
		System.out.println("���ܳԣ���");
	}
	public void getRun(){
		System.out.println("�����˶�����");
	}
}
class Liyu extends Animal{
	public void getEat(){
		System.out.println("����ԣ�ˮ�ݺͳ���");
	}
	public void getRun(){
		System.out.println("�����˶���ˮ����");
	}
}
class Laoying extends Animal{
	public void getEat(){
		System.out.println("��ӥ�ԣ�С��");
	}
	public void getRun(){
		System.out.println("��ӥ�˶����߿շ���");
	}
}
class Maque extends Animal{
	public void getEat(){
		System.out.println("��ȸ�ԣ����ϵĳ�");
	}
	public void getRun(){
		System.out.println("��ȸ�˶����Ϳշ���");
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
