package markv.interfaces;

public interface IReliefValve {
	void setReliefValveState(int reliefValveState);
	
	int IS_OPEN = 0;
	int IS_CLOSED = 1;
}
