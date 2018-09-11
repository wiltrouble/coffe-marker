package Test;

import coffeeMaker.enums.*;
import coffeeMaker.interfaces.*;

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
