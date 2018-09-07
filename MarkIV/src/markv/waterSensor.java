package markv;

import markv.enums.BoilerState;
import markv.interfaces.*;

public class waterSensor implements ISensor {
	public BoilerState waterLevel;
	
	@Override
	public BoilerState getBoilerLevel() {
		return this.waterLevel;
	}
}
