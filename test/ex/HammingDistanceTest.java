package ex;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.core.Is.*;
import org.junit.jupiter.api.Test;

class HammingDistanceTest {

	@Test
	void hammingTest1() {
		int test = HammingDistance.hammingDistance("abc", "abc");
		assertThat(test, is(0));
	}

	@Test
	void hammingTest2() {
		int test = HammingDistance.hammingDistance("abc", "abd");
		assertThat(test, is(1));
	}

	@Test
	void hammingTest3() {
		try {
			HammingDistance.hammingDistance("abcde", "abd");
			fail("mi aspettavo un'eccezione");
		} catch (IllegalArgumentException e) {

		}
	}
}
