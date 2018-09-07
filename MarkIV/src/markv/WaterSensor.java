package markv;

import markv.enums.*;
import markv.interfaces.*;

public class WaterSensor implements ISensor {
	public SensorState waterLevel;
	
	WaterSensor() {
		this.waterLevel = SensorState.IS_NOT_EMPTY;
	}
	
	@Override
	public SensorState getSensorState() {
		return this.waterLevel;
	}
	
	public void setSensorState(SensorState sensorState) {
	}
}
