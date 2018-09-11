
package coffeeMaker;

import coffeeMaker.enums.*;
import coffeeMaker.enums.WarmerState;
import coffeeMaker.enums.SensorStatePlate;
public class WarmerPlate implements IWarmerPot {
        private WarmerState warmerState;
        
        @Override
	public void setState(SensorStatePlate estadoSensor) {
                
		if(estadoSensor==SensorStatePlate.EMPTY) {			
			System.out.println("el sensor mado una seal de que el pot esta vacio //apagamos calentador");
                        warmerState = WarmerState.WARMER_IS_OFF;
                }		
                
		if(estadoSensor==SensorStatePlate.WARMER_EMPTY) {			
                        System.out.println("el sensor mado una se�al de que el pot no esta en su contendor //apagamos calentador");
			warmerState = WarmerState.WARMER_IS_OFF;
                }
                if(estadoSensor==SensorStatePlate.NOT_EMPTY) {    
                        System.out.println("el sensor mado una se�al de que el pot tiene contenido //prendemos el calentado calentador");
                        warmerState = WarmerState.WARMER_IS_ON;
                }
	}


        @Override
        public WarmerState getState() {
            return warmerState;
        }

   
	
}

