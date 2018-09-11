package coffeeMaker;

import coffeeMaker.interfaces.IReliefValve;
import coffeeMaker.enums.ValveState;

public class PressureRelief implements IReliefValve{
    private ValveState reliefState;
    @Override
    public ValveState getReliefValveState() {
        return reliefState;
    }

    @Override
    public void setReliefValveState(ValveState reliefValveState) {
        reliefState = reliefValveState;
    }

}
