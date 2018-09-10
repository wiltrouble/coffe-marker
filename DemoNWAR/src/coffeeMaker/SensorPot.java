package coffeeMaker;

import coffeeMaker.enums.SensorStatePlate;

public class SensorPot implements ISensorPot {
	
	private int weightPot=1;
	
	public SensorStatePlate getState(int overPlate) {
			
		if (overPlate<weightPot) {
			System.out.println("====sensor devuelve no existe pot====");
			return SensorStatePlate.WARMER_EMPTY;
			
			
		}
		
		if (overPlate==weightPot) {
			System.out.println("====sensor  devuelve que el pot esta  pero vacio====");
			return SensorStatePlate.EMPTY;
		}
		System.out.println("====sensor devuelve que el pot tiene contenido====");
		return SensorStatePlate.NOT_EMPTY;
	}

}
