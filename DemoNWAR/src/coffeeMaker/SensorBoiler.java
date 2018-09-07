<<<<<<< origin/AbelNWAR
package coffeeMaker;

public class SensorBoiler implements ISensor {

	@Override
	public void getState() {
		// TODO Auto-generated method stub
		
	}


}
=======
package coffeeMaker;

public class SensorBoiler implements ISensor {
	private int pesoBoiler=1;//1=vacio
	@Override
	public SensorState getState(int pesoParametro) {
	if (pesoParametro==pesoBoiler) {return SensorState.EMPTY;
	}
	
	return SensorState.NOT_EMPTY;
	
	}


	

}
>>>>>>> local
