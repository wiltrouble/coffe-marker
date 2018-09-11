package coffeeMaker;

import coffeeMaker.enums.SensorStateBoiler;
import coffeeMaker.enums.SensorStatePlate;

public class SensorPot implements ISensorPot {
	private SensorStatePlate statePlate;
	private int weightPot=1;
	
        
        public void setState(SensorStatePlate statePlate){
            this.statePlate = statePlate;
        }
        
	public SensorStatePlate getState(int overPlate) {
			
		if (overPlate<weightPot) {
			System.out.println("====sensor devuelve no existe pot====");
                        statePlate = SensorStatePlate.WARMER_EMPTY;
			return statePlate;
			
			
		}
		
		if (overPlate==weightPot) {
			System.out.println("====sensor  devuelve que el pot esta  pero vacio====");
			statePlate = SensorStatePlate.EMPTY;
                        return statePlate;
		}
		System.out.println("====sensor devuelve que el pot tiene contenido====");
		statePlate = SensorStatePlate.NOT_EMPTY;
                return statePlate;
	}

}
