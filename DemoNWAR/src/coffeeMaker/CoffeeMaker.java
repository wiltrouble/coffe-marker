package coffeeMaker;

public class CoffeeMaker {
	Boiler boiler = new Boiler();
	Pot pot = new Pot();
	Button button = new Button();
	Light light = new Light();
	SensorPot sensorPot = new SensorPot();
	SensorBoiler sensorBoiler = new SensorBoiler();
	SensorState state;
	public void makeCoffee() {
		//Es un ciclo infinito, pero tal vez se podria crear un flag para que cuando acabe el proceso cambie de estado
		while (boiler.flag==0) {
		//Pregunta si cambia de estado el boton
			if (button.state) {
				
				//Entra en funcionamiento el calentamiento del Boiler
				if (sensorBoiler.getState()) {
					boiler.startBrewing();
					pot.heatWarmer();
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
