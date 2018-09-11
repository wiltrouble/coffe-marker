package coffeeMaker;

import coffeeMaker.enums.*;

public class WaterSensor {
	public SensorStateBoiler waterLevel;
	
	public WaterSensor() {
		this.waterLevel = SensorStateBoiler.IS_EMPTY;
	}
	
	public SensorStateBoiler getSensorState() {
		return this.waterLevel;
	}
	
	public void setSensorState(SensorStateBoiler waterLevel) {
		this.waterLevel = waterLevel;
	}
}
