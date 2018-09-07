package markv.interfaces;

import markv.enums.*;

public interface ISensor {
	SensorState getSensorState();
	void setSensorState(SensorState sensorState);
}
