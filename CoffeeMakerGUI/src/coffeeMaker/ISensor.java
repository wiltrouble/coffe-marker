package coffeeMaker;
import coffeeMaker.enums.SensorStatePlate;
public interface ISensor {
	SensorStatePlate getState(int parameter);
}
