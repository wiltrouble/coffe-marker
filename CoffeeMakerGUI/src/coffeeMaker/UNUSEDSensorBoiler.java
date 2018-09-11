package coffeeMaker;
import coffeeMaker.enums.*;
public class UNUSEDSensorBoiler {
        //UN-USED
    
	private int pesoBoiler=1;//1=vacio
	
	public SensorStateBoiler getState(int pesoParametro) {
	if (pesoParametro==pesoBoiler) {
            return SensorStateBoiler.IS_EMPTY;
	}
	
	return SensorStateBoiler.IS_NOT_EMPTY;
	
	}
}

