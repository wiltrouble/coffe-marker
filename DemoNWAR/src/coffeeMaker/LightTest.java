package coffeeMaker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LightTest {

	@Test
	void testLedOff_Off_Correct() {
		Light indicator = new Light();
		indicator.off();
		assertEquals("OFF", indicator.state);
	}
	@Test
	void testLedCycle_On_Correct() {
		Light indicator = new Light();
		indicator.onCycleLight();
		assertEquals("BLUE", indicator.state);
	}
	@Test
	void testLedReady_On_Correct() {
		Light indicator = new Light();
		indicator.readyLight();
		assertEquals("GREEN", indicator.state);
	}
}
