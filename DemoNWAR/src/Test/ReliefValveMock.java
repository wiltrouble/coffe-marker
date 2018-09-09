package Test;

import coffeeMaker.enums.ValveState;
import coffeeMaker.interfaces.IReliefValve;

public class ReliefValveMock implements IReliefValve {
	private ValveState valveState;
	
	public ReliefValveMock() {
		valveState = ValveState.VALVE_IS_CLOSED;
	}
	
	@Override
	public ValveState getReliefValveState() {
		return valveState;
	}
	
	@Override
	public void setReliefValveState(ValveState reliefValveState) {
		valveState = reliefValveState;
	}
}
