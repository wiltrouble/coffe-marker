package coffeeMaker;

import coffeeMaker.enums.*;
import coffeeMaker.interfaces.IWarmer;

public abstract class WarmerBoiler implements IWarmer {
        private WarmerState warmerStateBoiler;
        @Override
        public WarmerState getWarmerState() {
            return warmerStateBoiler;
        }

        @Override
        @SuppressWarnings("static-access")
        public void setWarmerState(WarmerState warmerState) {
            if(warmerState == WarmerState.WARMER_IS_ON) {
			warmerStateBoiler = WarmerState.WARMER_IS_ON;
            }
		
		if(warmerState == warmerState.WARMER_IS_OFF) {
			warmerStateBoiler = WarmerState.WARMER_IS_OFF;
                }
        }

}
