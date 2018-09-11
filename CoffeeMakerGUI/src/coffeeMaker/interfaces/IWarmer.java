package coffeeMaker.interfaces;

import coffeeMaker.enums.*;

public interface IWarmer {
	WarmerState getWarmerState();
	void setWarmerState(WarmerState warmerState);
	void setWarmerState(SensorStatePlate estadoSensor);
}
