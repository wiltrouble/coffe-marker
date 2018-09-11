package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import coffeeMaker.WarmerPlate;
import coffeeMaker.enums.SensorStatePlate;
import coffeeMaker.enums.WarmerState;
import junit.framework.Assert;

public class WarmerPlateTest {

	@Test
	public void testSetState_warmerOff_correcto() {
		WarmerPlate warmerPlate=new WarmerPlate();
		warmerPlate.setState(SensorStatePlate.EMPTY);		
		assertEquals(warmerPlate.getState(), WarmerState.WARMER_IS_OFF);
		
	}
	
	
	
	@Test
	public void testSetState_warmerOn_correcto() {
			WarmerPlate warmerPlate=new WarmerPlate();
			warmerPlate.setState(SensorStatePlate.NOT_EMPTY);		
			assertEquals(warmerPlate.getState(), WarmerState.WARMER_IS_ON);
			}

	
	@Test
	public void testSetState_warmerOn_correcto2() {
			WarmerPlate warmerPlate=new WarmerPlate();
			warmerPlate.setState(SensorStatePlate.WARMER_EMPTY);		
			assertEquals(warmerPlate.getState(), WarmerState.WARMER_IS_OFF);
			}

	

}
