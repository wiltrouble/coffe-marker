package coffeeMaker;

import coffeeMaker.enums.SensorStatePlate;

public  interface ISensorPot {
	
	SensorStatePlate getState(int parameter) ;
}
