package b05;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class SimpleTest {

	@Test
	void IsEvenTrue() {
		Simple simple = new Simple();
		boolean result = simple.isEven(42);

		assertTrue(result);
	}

	@Test
	void IsEvenFalse() {
		Simple simple = new Simple();
		boolean result = simple.isEven(-43);

		assertFalse(result);
	}

	@Test
	void IsEvenZero() {
		Simple simple = new Simple();
		boolean result = simple.isEven(0);

		assertTrue(result);
	}
}