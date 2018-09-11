package coffeeMaker;

import coffeeMaker.enums.SensorStatePlate;

public class SensorPot {
	private SensorStatePlate statePlate;

	public void setState(SensorStatePlate statePlate) {
		this.statePlate = statePlate;
	}

	public SensorStatePlate getState() {
		return statePlate;
	}

}
