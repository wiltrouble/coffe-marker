package markv;

import markv.enums.*;
import markv.interfaces.*;

public class Boiler {
	private final IReliefValve reliefValve;
	private final IWarmer warmer;
	
	public Boiler(IReliefValve reliefValve, IWarmer warmer) {
		this.reliefValve = reliefValve;
		this.warmer = warmer;
	}
	
	public void startBrewing() {
		reliefValve.setReliefValveState(ValveState.VALVE_IS_CLOSED);
		warmer.setWarmerState(WarmerState.WARMER_IS_ON);
	}
}