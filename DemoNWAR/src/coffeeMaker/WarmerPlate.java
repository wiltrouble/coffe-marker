package coffeeMaker;

public class WarmerPlate implements IWarmer {
	protected ISensor sensor = new SensorPot();
	
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
