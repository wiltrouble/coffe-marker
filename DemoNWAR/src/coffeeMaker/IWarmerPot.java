package coffeeMaker;

import coffeeMaker.enums.SensorStatePlate;
import coffeeMaker.enums.WarmerState;

public  interface IWarmerPot {
	public WarmerState getState(SensorStatePlate estadoSensor) ;
}
