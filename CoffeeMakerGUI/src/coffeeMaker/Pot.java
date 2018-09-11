package coffeeMaker;

public class Pot {
	int capacidadPot;
        SensorPot sensorPot;
	WarmerPlate warmerPlate;
        
	public Pot(SensorPot sensorPot, WarmerPlate warmerPlate ) {
            this.warmerPlate = warmerPlate;
            this.sensorPot = sensorPot;
	}
        
        public void heatPot(int ParamatePot) {
            warmerPlate.setState(sensorPot.getState(ParamatePot));
        }
        
        public void pauseHeatPot(int ParamatePot) {
            warmerPlate.setState(sensorPot.getState(ParamatePot));
        }
        
}
