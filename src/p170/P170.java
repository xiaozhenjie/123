package p170;

public class P170 {

	public static void main(String[] args) {
		Truck t1=new Truck();
		System.out.println("��Ĭ�ϡ�"+t1.printInfo());
		t1.fire();
		t1.left();
		Truck t2=new Truck(43,53);
		System.out.println("���вι��졿"+t2.printInfo());
		t2.fire();
		t2.right();
		t2.flameout();
		Truck t3=new Truck(34,58);
		System.out.println("���вι��졿�����������"+t3.printInfo());
		
		Bigcar b1=new Bigcar();
		System.out.println("��Ĭ�ϡ�"+b1.printInfo());
		b1.fire();
		b1.flameout();
		Bigcar b2=new Bigcar(23,45);
		System.out.println("���вι��졿"+b2.printInfo());
		b2.fire();
		b2.right();
		b2.left();
		b2.flameout();
		Bigcar b3=new Bigcar(12,-2);
		System.out.println("���вι��졿������Ϊ������"+b3.printInfo());
		b3.fire();
		
		Car c1=new Car();
		System.out.println("��Ĭ�ϡ�"+c1.printInfo());
		c1.fire();
		c1.right();
		Car c2=new Car(16,3);
		System.out.println("���вι��졿"+c2.printInfo());
		c2.fire();
		c2.flameout();
		Car c3=new Car(14,8);
		System.out.println("���вι��졿������Ϊ8��"+c3.printInfo());
		c3.left();
	}
}
