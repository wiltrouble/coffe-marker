package coffeeMaker;

import coffeeMaker.enums.*;
import coffeeMaker.interfaces.IWarmer;

public class WarmerBoiler implements IWarmer {
        private WarmerState warmerStateBoiler;
        @Override
        public WarmerState getWarmerState() {
            return warmerStateBoiler;
        }

        public void setWarmerState(WarmerState warmerState) {
            warmerStateBoiler = warmerState;
        }

}
