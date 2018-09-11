package coffeeMaker;

import coffeeMaker.enums.SensorStatePlate;
import coffeeMaker.enums.WarmerState;


public  interface IWarmerPot {
	public void setState(SensorStatePlate estadoSensor);
        WarmerState getState();
}
