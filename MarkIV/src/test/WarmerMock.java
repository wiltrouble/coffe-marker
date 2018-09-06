package test;

import markv.enums.*;
import markv.interfaces.*;

public class WarmerMock implements IWarmer {
	private WarmerState warmerState;
	
	public WarmerMock() {
		warmerState = WarmerState.WARMER_IS_OFF;
	}
	
	@Override
	public WarmerState getWarmerState() {
		return warmerState;
	}
	
	@Override
	public void setWarmerState(WarmerState warmerState) {
		this.warmerState = warmerState;	
	}
}
