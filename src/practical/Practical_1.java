package practical;

import java.util.Random;

public class Practical_1 {

	public static void main(String[] args) {

		int limit;
		Random rnumbr = new Random();

		int[] numbers = new int[999];
		numbers[0] = rnumbr.nextInt(999);
		int smallest = numbers[0];
		for (limit = 0; limit <= 500; limit++) {
			numbers[limit] = rnumbr.nextInt(999);
			smallest = Math.min(smallest, numbers[limit]);
		}

		System.out.println(smallest);

	}

}
