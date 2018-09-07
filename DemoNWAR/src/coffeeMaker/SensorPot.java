<<<<<<< origin/AbelNWAR
package coffeeMaker;

public class SensorPot implements ISensor {
	public sensorStates getState() {
		return sensorStates.NOT_EMPTY;
  }
}
=======
package coffeeMaker;

public class SensorPot implements ISensor {
private int weightPot=1;
	
	public SensorState getState(int overPlate) {
		
		
		if (overPlate<weightPot) {return SensorState.WARMER_EMPTY;
			
		}
		
		if (overPlate==weightPot) {return SensorState.EMPTY;
		
		}
				
		return SensorState.NOT_EMPTY;
	}

	}
>>>>>>> local
