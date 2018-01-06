package Ëæ»úÊı;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random ran = new Random(10);
		System.out.println(ran.nextInt(100));
		Random ran1 = new Random(10);
		System.out.println(ran1.nextInt(100));
	}

}
