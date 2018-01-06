package runtime;

public class RuntimeFc {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println(r.freeMemory());
		r.gc();
		System.out.println(r.freeMemory());

	}

}
