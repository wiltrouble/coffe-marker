package coffeeMaker;

public class Button {
	public boolean state=false;
	public boolean on() {
		state=true;
		return state;
	}
	public boolean off() {
		state=false;
		return state;
	}
}
