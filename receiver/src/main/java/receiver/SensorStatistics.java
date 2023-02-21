package receiver;

import java.util.List;

public class SensorStatistics {

	public static void generateBMSStatistics(IMessagePrinter messagePrinter) {
		Integer[] temperatureData = DataGenerator.generateSenderResult();
		Integer[] SOCData = DataGenerator.generateSenderResult();

		generateStatistics(temperatureData, messagePrinter);
		generateStatistics(SOCData, messagePrinter);
	}

	public static void generateStatistics(Integer[] sensorData, IMessagePrinter messagePrinter) {
		Integer[] readingsArray = DataGenerator.generateSenderResult();
		List<Integer> readingsList = DataProcessor.convertIntegerArrayToList(readingsArray);
		Integer maxValue = DataProcessor.getMaximumValue(readingsList);
		Integer minValue = DataProcessor.getMinimunValue(readingsList);
		double averageValue = DataProcessor.getMovingAverageValue(readingsList);
		messagePrinter.printStatistics(maxValue, minValue, averageValue);
	}
}
