package test;

public class TestDemo {

	public static void main(String[] args) {
		Animal p1;
		p1 = new Dog();
		p1.sleep();
		p1.run();
		p1 = new Cat();
		p1.sleep();
		p1.run();

		/*myTest(new Cat(),new Dog());
		myTest(new Dog(),new Cat());*/
	}

	private static void myTest(Animal k1, Animal k2) {
		k1.run();
		k2.sleep();
	}

}
