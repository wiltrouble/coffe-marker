package test;

import markv.Boiler;
import markv.enums.*;
import markv.interfaces.*;
import org.junit.*;

public class BoilerTest {
	private IWarmer warmer;
	private IReliefValve reliefValve;
	private Boiler boiler;
	
	@Before
	public void setup() {
		warmer = new WarmerMock();
		reliefValve = new ReliefValveMock();
		boiler = new Boiler(reliefValve, warmer);
	}
	
	@Test
	public void testIsBoilerOnWhenStartBrewing() throws Exception {
		boiler.startBrewing();
		assert(warmer.getWarmerState() == WarmerState.WARMER_IS_ON);
	}
	
	@Test
	public void testIsReliefValveClosedWhenStartBrewing() throws Exception {
		boiler.startBrewing();
		assert(reliefValve.getReliefValveState() == ValveState.VALVE_IS_CLOSED);
	}
	
	@Test
	public void testIsBolierOnAndReliefValveClosedWhenStartBrewing() throws Exception {
		boiler.startBrewing();
		assert(warmer.getWarmerState() == WarmerState.WARMER_IS_ON);
		assert(reliefValve.getReliefValveState() == ValveState.VALVE_IS_CLOSED);
	}
	
	@Test
	public void testIsBolerOffWhenPause() throws Exception {
		boiler.pause();
		assert(warmer.getWarmerState() == WarmerState.WARMER_IS_OFF);
	}
	
	@Test
	public void testIsReliefValveOpenWhenPause() throws Exception {
		boiler.pause();
		assert(reliefValve.getReliefValveState() == ValveState.VALVE_IS_OPEN);
	}
	
	@Test
	public void testIsBoilerOffAndReliefValveOpenWhenPause() throws Exception {
		boiler.pause();
		assert(warmer.getWarmerState() == WarmerState.WARMER_IS_OFF);
		assert(reliefValve.getReliefValveState() == ValveState.VALVE_IS_OPEN);
	}
}
