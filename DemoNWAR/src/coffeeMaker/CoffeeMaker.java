package coffeeMaker;

import coffeeMaker.enums.SensorStateBoiler;
import coffeeMaker.interfaces.*;
import coffeeMaker.enums.SensorStatePlate;
import coffeeMaker.WarmerBoiler;
public class CoffeeMaker {
	public int cupsBoiler;
	public int cupsPot;
	Boiler boiler;
	Pot pot;
	Button button;
	Light light;
	IWarmer warmer;
	SensorPot sensorPot;
	WaterSensor waterSensor;
        WarmerBoiler waterBoiler;

	public CoffeeMaker(int cupsBoiler, int cupsPot, SensorPot sensorPot, Pot pot,
			WaterSensor waterSensor, Light light, Button button, 
                        PressureRelief pressureRelief, WarmerBoiler warmerBoiler) {
		this.button = button;
		this.cupsBoiler = cupsBoiler;
		this.waterSensor = waterSensor;
		this.cupsPot = cupsPot;
		this.sensorPot = sensorPot;
		this.pot = pot;
		this.light = light;
		this.button = button;
                boiler = new Boiler(pressureRelief, warmerBoiler);
                        
	}
        public void update (int cupsBoiler, int cupsPot, SensorPot sensorPot, Pot pot,
			WaterSensor waterSensor, Light light, Button button) {
		this.button = button;
		this.cupsBoiler = cupsBoiler;
		this.waterSensor = waterSensor;
		this.cupsPot = cupsPot;
		this.sensorPot = sensorPot;
		this.pot = pot;
		this.light = light;
		this.button = button;
	}

	public void makeCoffee() {
                System.out.println("Test Tazas="+cupsBoiler);
                System.out.println("Sensor de agua="+waterSensor.getSensorState());
                System.out.println("Sensor de pot ="+sensorPot.getState());
		// while (cupsBoiler!=0) {

		// Pregunta si cambia de estado el boton
		if (button.state) {

			// Entra en funcionamiento el calentamiento del Boiler
			if (waterSensor.getSensorState() == SensorStateBoiler.IS_NOT_EMPTY) {
				
                                // Pregunta si se retira el pot de la zonaPot
				if (sensorPot.getState() == SensorStatePlate.WARMER_EMPTY) {
					boiler.pause();
					pot.pauseHeatPot();
					light.waitingLight();
				}
                                else{
                                    boiler.startBrewing();
                                    pot.heatPot();
                                    light.onCycleLight();
                                }

			}

		} else {
			// Enciende un LED de espera.
			light.waitingLight();
		}
		// Pregunta si ya no hay agua en el boiler, y si ya no hay acaba el proceso
		if (cupsBoiler == 0) {
                        System.out.println("Termino el proceso");
			boiler.pause();
			light.readyLight();
			pot.pauseHeatPot();
			button.off();
                        
		}
		// }

	}
}
