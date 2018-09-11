
package coffeeMaker;

import coffeeMaker.enums.*;
import coffeeMaker.interfaces.*;

public abstract class WarmerPlate implements IWarmer {
	private WarmerState warmerState;

	@Override
	public void setWarmerState(SensorStatePlate estadoSensor) {

		if (estadoSensor == SensorStatePlate.EMPTY) {
			System.out.println("el sensor mado una seal de que el pot esta vacio //apagamos calentador");
			warmerState = WarmerState.WARMER_IS_OFF;
		}

		if (estadoSensor == SensorStatePlate.WARMER_EMPTY) {
			System.out
					.println("el sensor mado una se�al de que el pot no esta en su contendor //apagamos calentador");
			warmerState = WarmerState.WARMER_IS_OFF;
		}
		if (estadoSensor == SensorStatePlate.NOT_EMPTY) {
			System.out.println(
					"el sensor mado una se�al de que el pot tiene contenido //prendemos el calentado calentador");
			warmerState = WarmerState.WARMER_IS_ON;
		}
	}

	@Override
	public WarmerState getWarmerState() {
		return warmerState;
	}
	
}

