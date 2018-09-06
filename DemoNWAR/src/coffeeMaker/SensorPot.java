package coffeeMaker;

public class SensorPot implements ISensor {

	protected SensorState state;
	
	
	public SensorState getState() {
		if(state==SensorState.EMPTY) {		
		state=SensorState.EMPTY;
		}
		if(state==SensorState.NOT_EMPTY) {
			state=SensorState.NOT_EMPTY;
		}
		if(state==SensorState.WARMER_EMPTY) {
			state=SensorState.WARMER_EMPTY;
		}
		return state;
		
		
		}
		
		
		

}
