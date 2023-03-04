package receiver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DataProcessorTest {

	@Test
	public void testGetMaximumValue() {
		List<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer result = DataProcessor.getMaximumValue(values);
		assertEquals(new Integer(5), result);
	}

	@Test
	public void testGetMinimunValue() {
		List<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer result = DataProcessor.getMinimunValue(values);
		assertEquals(new Integer(1), result);
	}

	@Test
	public void testGetMovingAverageValue() {
		List<Integer> values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		double result = DataProcessor.getMovingAverageValue(values);
		assertTrue(result == 8);

		// Readings count is less than 10
		values = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		result = DataProcessor.getMovingAverageValue(values);
		assertTrue(result == -1);
	}

	@Test
	public void testArrayToListConversion() {
		Integer[] intArray = new Integer[] { 1, 2, 3, 4 };
		List<Integer> result = DataProcessor.convertIntegerArrayToList(intArray);
		assertEquals(new Integer(1), result.get(0));
	}
}
