package coffeeMaker;

public class WarmerPlate implements IWarmer {

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
			
			
		
	}
	
	
	
	
}