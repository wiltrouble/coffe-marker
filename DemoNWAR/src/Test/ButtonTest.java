package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import coffeeMaker.Button;

class ButtonTest {

	@Test
	void testButton_On_True() {
		Button button = new Button();
		button.on();
		assertTrue(button.state);
	}
	@Test
	void testButton_Off_False() {
		Button button = new Button();
		button.off();
		assertFalse(button.state);
	}
	@Test
	void testButton_NoInput_False() {
		Button button = new Button();
		assertFalse(button.state);
	}

}
