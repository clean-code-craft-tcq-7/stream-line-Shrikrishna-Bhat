package receiver;

public class MessagePrinter implements IMessagePrinter {

	public void printStatistics(Integer maxValue, Integer minValue, double averageValue) {
		System.out.println("Maximum Value: " + maxValue);
		System.out.println("Minimum Value: " + minValue);
		System.out.println("Averages Value: " + averageValue);
	}
}
