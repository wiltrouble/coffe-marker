package coffeeMaker;

public class WarmerBoiler implements IWarmer {
<<<<<<< origin/AbelNWAR
	protected boolean on;
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
=======

	@Override
	public boolean swichWarmer(SensorState estadoSensor) {
		boolean estadoCalentador=true;
		if(estadoSensor==SensorState.NOT_EMPTY) {
			estadoCalentador =false;
				}
		
		if(estadoSensor==SensorState.WARMER_EMPTY) {
			estadoCalentador= false;
				}
		
		return estadoCalentador;
>>>>>>> local
	}
	
}
