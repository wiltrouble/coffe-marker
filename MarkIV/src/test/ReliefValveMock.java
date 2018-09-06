package test;

import markv.interfaces.IReliefValve;

public class ReliefValveMock implements IReliefValve {
	public boolean valveClosed;
	
	public ReliefValveMock() {
		valveClosed = true;
	}
	
	@Override
	public void setReliefValveState(int reliefValveState) {
		valveClosed = reliefValveState == IS_CLOSED;
	}
}
