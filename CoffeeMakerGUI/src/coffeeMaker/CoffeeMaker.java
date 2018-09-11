package coffeeMaker;

import coffeeMaker.enums.SensorStateBoiler;
import coffeeMaker.interfaces.IReliefValve;
import coffeeMaker.interfaces.IWarmer;
import coffeeMaker.enums.SensorStatePlate;

public class CoffeeMaker {
	Boiler boiler;
	Pot pot;
	Button button;
	Light light;
        int cupsBoiler;
        int cupsPot;
	IWarmer warmer;
	SensorPot sensorPot;
	WaterSensor waterSensor;
        
        public CoffeeMaker(boolean state, int cupsBoiler, int cupsPot, SensorPot sensorPot, Pot pot, WaterSensor waterSensor, Light light, Button button){
            button = new Button(state);
            this.cupsBoiler = cupsBoiler;
            this.waterSensor = waterSensor;
            this.cupsPot = cupsPot;
            this.sensorPot = sensorPot;
            this.pot = pot;
            this.light = light;
            this.button = button;
        }
        
	
	public void makeCoffee() {
		
		//while (cupsBoiler!=0) {
                
		//Pregunta si cambia de estado el boton
			if (button.state) {
				
				//Entra en funcionamiento el calentamiento del Boiler
				if (waterSensor.getSensorState()== SensorStateBoiler.IS_NOT_EMPTY) {
					boiler.startBrewing();
					pot.heatPot();
					light.onCycleLight();
				
                                        
					//Pregunta si se retira el pot de la zonaPot
					if( sensorPot.getState() == SensorStatePlate.EMPTY ) {
						boiler.pause();
						pot.pauseHeatPot();
						light.waitingLight();
					}
					
				}
				
			}
			else {
				//Enciende un LED de espera.
				light.waitingLight();
			}
                        //Pregunta si ya no hay agua en el boiler, y si ya no hay acaba el proceso
                        if(cupsBoiler == 0) {
                                boiler.pause();
                                light.readyLight();
                                pot.pauseHeatPot();
                                button.off();
                        }
		//}
		
	}
}
