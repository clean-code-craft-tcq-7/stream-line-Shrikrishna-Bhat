package receiver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataProcessor {

	public static Integer getMaximumValue(List<Integer> readings) {
		return Collections.max(readings);
	}

	public static Integer getMinimunValue(List<Integer> readings) {
		return Collections.min(readings);
	}

	public static List<Integer> convertIntegerArrayToList(Integer[] readings) {
		return new ArrayList<Integer>(Arrays.asList(readings));
	}

	public static double getMovingAverageValue(List<Integer> readings) {
		if (readings.size() >= 10) {
			List<Integer> lastFiveValues = readings.subList(readings.size() - 5, readings.size());
			Integer readingSum = 0;
			for (Integer reading : lastFiveValues) {
				readingSum = readingSum + reading;
			}
			return readingSum / (lastFiveValues.size());
		}
		return -1;
	}
}
