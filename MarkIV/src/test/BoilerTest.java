package test;

import markv.Boiler;
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
	
	private void startBrewing() {
		boiler.startBrewing();
	}
	
	@Test
	public void testIsBoilerOn() throws Exception {
		startBrewing();
		assert(warmer.boilerOn);
	}
	
	@Test
	public void testIsReliefValveClosed() throws Exception {
		startBrewing();
		assert(reliefValve.valveClosed);
	}
	
	@Test
	public void TestIsBolierOnAndReliefValveClosed() throws Exception {
		startBrewing();
		assert(warmer.boilerOn);
		assert(reliefValve.valveClosed);
	}
}
