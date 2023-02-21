package receiver;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SensorStatisticsTest {

	@Test
	public void test() {
		FakeMessagePrinter fakeMessagePrinter = new FakeMessagePrinter();
		SensorStatistics.generateBMSStatistics(fakeMessagePrinter);
		assertEquals(new Integer(2), fakeMessagePrinter.invocationCount);
	}
}
