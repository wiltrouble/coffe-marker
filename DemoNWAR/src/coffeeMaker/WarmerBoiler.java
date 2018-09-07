package coffeeMaker;

public class WarmerBoiler implements IWarmer {
	protected boolean on;
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public boolean isOn() {
		return this.on;
	}
}
