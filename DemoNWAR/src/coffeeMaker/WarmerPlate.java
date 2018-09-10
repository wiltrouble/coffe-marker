
package coffeeMaker;

import coffeeMaker.enums.SensorStatePlate;
import coffeeMaker.enums.WarmerState;
import coffeeMaker.interfaces.IWarmer;

public class WarmerPlate implements IWarmerPot {

	public WarmerState getState(SensorStatePlate estadoSensor) {
	
		if(estadoSensor==SensorStatePlate.EMPTY) {
			
			System.out.println("el sensor mado una señal de que el pot esta vacio //apagamos calentador");
			return WarmerState.WARMER_IS_OFF;			
				}		
		if(estadoSensor==SensorStatePlate.WARMER_EMPTY) {
			

			System.out.println("el sensor mado una señal de que el pot no esta en su contendor //apagamos calentador");
				return WarmerState.WARMER_IS_OFF;
				}
		

		System.out.println("el sensor mado una señal de que el pot tiene contenido //prendemos el calentado calentador");
		return WarmerState.WARMER_IS_ON;
	}
	
}

