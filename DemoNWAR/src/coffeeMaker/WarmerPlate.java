
package coffeeMaker;

import coffeeMaker.enums.*;
import coffeeMaker.interfaces.*;

public class WarmerPlate implements IWarmer {
	private WarmerState warmerState;

        
	public void setWarmerState(SensorStatePlate estadoSensor) {

		if (estadoSensor == SensorStatePlate.EMPTY) {
			System.out.println("---> Jarra Vacia");
			warmerState = WarmerState.WARMER_IS_OFF;
		}

		if (estadoSensor == SensorStatePlate.WARMER_EMPTY) {
			System.out.println("---> No hay Jarra!!!!--- Calentador OFF");
			warmerState = WarmerState.WARMER_IS_OFF;
		}
		if (estadoSensor == SensorStatePlate.NOT_EMPTY) {
			System.out.println("---> Jarra no Vacia--- Calentador ON");
			warmerState = WarmerState.WARMER_IS_ON;
		}
	}
        public void setWarmeroff(){
            System.out.println("Calentador Stop");
            warmerState = WarmerState.WARMER_IS_OFF;
        }

	@Override
	public WarmerState getWarmerState() {
		return warmerState;
	}
	
}

