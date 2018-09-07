package coffeeMaker;

public class Button {
	public boolean state;
	public boolean buttonOn() {
		state=true;
		return state;
	}
	public boolean buttonOff() {
		state=false;
		return state;
	}
}
