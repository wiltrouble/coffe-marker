package coffeeMaker;

import coffeeMaker.enums.SensorStateBoiler;
import coffeeMaker.interfaces.IReliefValve;
import coffeeMaker.interfaces.IWarmer;

public class CoffeeMaker {
	PressureRelief reliefValve = new PressureRelief();
        Boiler boiler = new Boiler();
	Pot pot = new Pot();
	Button button;
	Light light = new Light();
        int cups;
        int cupsPot;
	IWarmer warmer;
	SensorPot sensorPot = new SensorPot();
	SensorStateBoiler waterSensor;
        public CoffeeMaker(boolean state, int cups, SensorStateBoiler waterSensor, int cupsPot){
            button = new Button(state);
            this.cups = cups;
            this.waterSensor = waterSensor;
            this.cupsPot = cupsPot;
        }
	SensorState state;
	public void makeCoffee() {
		//Es un ciclo infinito, pero tal vez se podria crear un flag para que cuando acabe el proceso cambie de estado
		while (cups!=0) {
		//Pregunta si cambia de estado el boton
			if (button.state) {
				
				//Entra en funcionamiento el calentamiento del Boiler
				if (waterSensor.IS_NOT_EMPTY == SensorStateBoiler.IS_NOT_EMPTY) {
					boiler.startBrewing();
					pot.heatPot(cupsPot);
					light.onCycleLight();
				
                                        
					//Pregunta si se retira el pot de la zonaPot
					if(sensorPot.getState()==state.EMPTY) {
						boiler.pause();
						pot.pauseWarmer();
						light.waitingLight();
					}
					
					//Pregunta si ya no hay agua en el boiler, y si ya no hay acaba el proceso
					if(sensorBoiler.getState()==state.EMPTY) {
						boiler.pause();
						light.readyLight();
						pot.pauseWarmer();
						button.off();
						break;
					}
				}
				
			}
			else {
				//Enciende un LED de espera.
				light.waitingLight();
			}
			
		}
		
	}
}
