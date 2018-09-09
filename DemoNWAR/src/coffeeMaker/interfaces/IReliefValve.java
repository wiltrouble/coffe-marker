package coffeeMaker.interfaces;

import coffeeMaker.enums.*;

public interface IReliefValve {
	ValveState getReliefValveState();
	void setReliefValveState(ValveState reliefValveState);
}
