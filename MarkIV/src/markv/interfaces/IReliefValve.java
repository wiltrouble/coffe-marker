package markv.interfaces;

import markv.enums.*;

public interface IReliefValve {
	ValveState getReliefValveState();
	void setReliefValveState(ValveState reliefValveState);
}
