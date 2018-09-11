package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import coffeeMaker.Pot;
import coffeeMaker.SensorPot;
import coffeeMaker.WarmerPlate;

public class PotTest {

	@Test
	public void testHardPot_NoExistePot_correcto() {
		SensorPot sensor=new SensorPot();
		WarmerPlate warmer=new WarmerPlate();

	Pot name = new Pot(sensor, warmer);
	
	name.heatPot(0);
	}
	
	
	@Test
	public void testHarPot_Potvacio_correcto() {
		SensorPot sensor=new SensorPot();
		WarmerPlate warmer=new WarmerPlate();
		Pot name = new Pot(sensor, warmer);
	
		name.heatPot(1);
	}
	
	
	@Test
	public void testHarPot_PotNoVacio_correcto() {
		SensorPot sensor=new SensorPot();
		WarmerPlate warmer=new WarmerPlate();

	Pot name = new Pot(sensor, warmer);
	
	name.heatPot(1);
	}

}
