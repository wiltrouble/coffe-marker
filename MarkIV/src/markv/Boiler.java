package markv;

import markv.interfaces.*;

public class Boiler {
	private final IReliefValve reliefValve;
	private final IWarmer warmer;
	
	public Boiler(IReliefValve reliefValve, IWarmer warmer) {
		this.reliefValve = reliefValve;
		this.warmer = warmer;
	}
	
	public void startBrewing() {
		reliefValve.setReliefValveState(IReliefValve.IS_CLOSED);
		warmer.setWarmerState(IWarmer.IS_ON);
	}
}
