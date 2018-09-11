package coffeeMaker;

import coffeeMaker.enums.SensorStateBoiler;
import coffeeMaker.enums.SensorStatePlate;

public class SensorPot implements ISensorPot {
	private SensorStatePlate statePlate;
	private int weightPot=1;
	
        
        public void setState(SensorStatePlate statePlate){
            this.statePlate = statePlate;
        }
        
	public SensorStatePlate getState() {
            return statePlate;
	}

}
