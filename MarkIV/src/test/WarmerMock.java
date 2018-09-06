package test;

import markv.interfaces.IWarmer;

public class WarmerMock implements IWarmer {
	public boolean boilerOn;
	
	public WarmerMock() {
		this.boilerOn = false;
	}
	
	@Override
	public void setWarmerState(int warmerState) {
		this.boilerOn = warmerState == IS_ON;	
	}
}
