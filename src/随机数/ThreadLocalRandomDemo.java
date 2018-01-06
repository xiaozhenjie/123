package 随机数;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {

	public static void main(String[] args) {
		ThreadLocalRandom random = ThreadLocalRandom.current();
		System.out.println(random.nextInt(12,123));//[12,123)之间的随机数
	}

}
