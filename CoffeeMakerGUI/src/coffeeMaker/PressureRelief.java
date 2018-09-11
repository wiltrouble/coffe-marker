package coffeeMaker;

import coffeeMaker.interfaces.IReliefValve;
import markv.enums.ValveState;

public class PressureRelief implements IReliefValve{

    @Override
    public ValveState getReliefValveState() {
        return null;
    }

    @Override
    public void setReliefValveState(ValveState reliefValveState) {
        
    }

}
