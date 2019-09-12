package ex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArmstrongTest {
	
	@Test
    void Armstrong() {
         boolean test = Armstrong.isArmstrong(153);
        assertEquals(test, true);
    }
	
	@Test
    void NotArmstrong() {
         boolean test = Armstrong.isArmstrong(250);
        assertEquals(test, false);
    }
}