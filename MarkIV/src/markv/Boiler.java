package markv;

import markv.enums.*;
import markv.interfaces.*;

public class Boiler {
	private final IReliefValve reliefValve;
	private final IWarmer warmer;
	protected ISensor waterSensor;
	
	public Boiler(IReliefValve reliefValve, IWarmer warmer) {
		this.reliefValve = reliefValve;
		this.warmer = warmer;
		this.waterSensor = new WaterSensor();
	}
	
	public void startBrewing() {
		reliefValve.setReliefValveState(ValveState.VALVE_IS_CLOSED);
		warmer.setWarmerState(WarmerState.WARMER_IS_ON);
	}
	
	public void pause() {
		warmer.setWarmerState(WarmerState.WARMER_IS_OFF);
		reliefValve.setReliefValveState(ValveState.VALVE_IS_OPEN);
	}
	
	public boolean isReady() {
		if (waterSensor.getSensorState() == SensorState.IS_EMPTY) {
			return false;
		}
		
		return true;
	}
}