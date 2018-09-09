package coffeeMaker;

import coffeeMaker.enums.*;

public class WaterSensor {
	public SensorStateBoiler waterLevel;
	
	WaterSensor() {
		this.waterLevel = SensorStateBoiler.IS_NOT_EMPTY;
	}
	
	public SensorStateBoiler getSensorState() {
		return this.waterLevel;
	}
	
	public void setSensorState(SensorStateBoiler sensorState) {
		this.waterLevel = sensorState;
	}
}
