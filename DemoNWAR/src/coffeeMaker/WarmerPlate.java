package coffeeMaker;

public class WarmerPlate implements IWarmer {
	protected ISensor sensor = new SensorPot();
	protected boolean on;
	
	public void turnOn() {
		if (sensor.getState() == sensorStates.NOT_EMPTY) {
			this.on = true;
		} else {
			this.on = false;
		}
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public boolean isOn() {
		return this.on;
	}
}
