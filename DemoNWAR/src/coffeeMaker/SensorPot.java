package coffeeMaker;

public class SensorPot implements ISensor {
	public sensorStates getState() {
		return sensorStates.NOT_EMPTY;
	}
}
