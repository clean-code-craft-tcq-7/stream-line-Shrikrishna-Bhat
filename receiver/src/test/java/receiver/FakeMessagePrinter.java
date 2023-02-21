package receiver;

public class FakeMessagePrinter implements IMessagePrinter {

	Integer invocationCount = 0;

	public void printStatistics(Integer maxValue, Integer minValue, double averageValue) {
		invocationCount++;
	}

}
