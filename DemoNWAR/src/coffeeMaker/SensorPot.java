package coffeeMaker;

public class SensorPot implements ISensor {
	public SensorState getState() {
		return SensorState.NOT_EMPTY;
  }
}
