package coffeeMaker;

public class Pot {
	int capacidadPot;
        SensorPot sensorPot;
	WarmerPlate warmerPlate;
        
	public Pot(SensorPot sensorPot, WarmerPlate warmerPlate ) {
            this.warmerPlate = warmerPlate;
            this.sensorPot = sensorPot;
	}
        
        public void heatPot() {
            warmerPlate.setWarmerState(sensorPot.getState());
        }
        
        public void pauseHeatPot() {
            warmerPlate.setWarmerState(sensorPot.getState());
        }
        
}
