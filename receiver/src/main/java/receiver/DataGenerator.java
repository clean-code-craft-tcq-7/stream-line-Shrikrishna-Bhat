package receiver;

import java.util.Random;

public class DataGenerator {

	public static Integer[] generateSenderResult() {
		Random random = new Random();
		Integer[] readings = new Integer[15];
		for (int i = 0; i < 15; i++) {
			readings[i] = (random.nextInt() % 100) + 1;
		}
		return readings;
	}

}
