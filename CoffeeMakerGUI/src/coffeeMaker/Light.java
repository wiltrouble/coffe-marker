package coffeeMaker;

import coffeeMaker.enums.LEDcolours;

public class Light {
	public LEDcolours state;
	LEDcolours color;
	public void off() {
		state=color.OFF;
		System.out.println("The LED is "+state);
	}
	public void readyLight() {
		state=color.GREEN;
		System.out.println("The LED is "+state);
	}
	public void onCycleLight() {
		state=color.BLUE;
		System.out.println("The LED is "+state);
	}
	public void waitingLight() {
		state=color.ORANGE;
		System.out.println("The LED is "+state);
	}
	
}
