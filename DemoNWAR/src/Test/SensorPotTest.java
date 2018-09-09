package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import coffeeMaker.SensorPot;
import coffeeMaker.SensorState;

public class SensorPotTest {

	@Test
	public void testPotVacio_vacio_correcto() {
		SensorPot s1 = new SensorPot();
		assertEquals(SensorState.EMPTY, s1.getState(1));
	}
	
	@Test
	public void testPotVacio_vacio_incorrecto() {
		SensorPot s1 = new SensorPot();
		assertNotEquals(SensorState.EMPTY, s1.getState(2341));
	}
	
	@Test
	public void testPotNoVacio_noVacio_correcto() {
		SensorPot s1 = new SensorPot();
		assertEquals(SensorState.NOT_EMPTY, s1.getState(34));
	}
	
	@Test
	public void testPotNoVacio_noVacio_incorrecto() {
		SensorPot s1 = new SensorPot();
		assertNotEquals(SensorState.NOT_EMPTY, s1.getState(1));
	}

	@Test
	public void testWarmerEmpty_Vacio_correcto() {
		SensorPot s1 = new SensorPot();
		assertEquals(SensorState.WARMER_EMPTY, s1.getState(0));
	}

	@Test
	public void testWarmerEmpty_Vacio_incorrecto() {
		SensorPot s1 = new SensorPot();
		assertNotEquals(SensorState.WARMER_EMPTY, s1.getState(5));
	}


}
