package coffeeMaker;

public class Light {
	protected String state;
	public void off() {
		state="OFF";
		System.out.println("The LED is "+state);
	}
	public void readyLight() {
		state="GREEN";
		System.out.println("The LED is "+state);
	}
	public void onCycleLight() {
		state="BLUE";
		System.out.println("The LED is "+state);
	}
	
}
