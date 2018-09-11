package coffeeMaker;

import coffeeMaker.enums.WarmerState;
import coffeeMaker.interfaces.IWarmer;

public class WarmerBoiler implements IWarmer {
        private WarmerState warmerStateBoiler;
        @Override
        public WarmerState getWarmerState() {
            return warmerStateBoiler;
        }

        @Override
        public void setWarmerState(WarmerState warmerState) {
            if(warmerState == WarmerState.WARMER_IS_ON) {
			warmerStateBoiler = WarmerState.WARMER_IS_ON;
            }
		
		if(warmerState == warmerState.WARMER_IS_OFF) {
			warmerStateBoiler = WarmerState.WARMER_IS_OFF;
                }
        }
}
