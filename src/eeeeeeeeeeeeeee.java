class Base {
	int x = 1;
	static int y = 2;
	int z = 3;
	int method() {
		System.out.println("Base.method()");
		return x;
	}
}
class Subclass extends Base {
	int x = 4;
	int y = 5;
	static int z = 6;
	int method() {
		System.out.println("Subclass.method()");
		return x;
	}
}
public class eeeeeeeeeeeeeee {
	public static void main(String[] args) {

		Subclass s = new Subclass();

		System.out.println(s.x + " " + s.y + " " + s.z);

		System.out.println(s.method());

		Base b = (Base) s;

		System.out.println(b.x + " " + b.y + " " + b.z);

		System.out.println(b.method());

	}
}
