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
		if (warmer instanceof WarmerMock) {
			WarmerMock w = (WarmerMock)warmer;
			assert(w.boilerOn);
		}
	}
	
	@Test
	public void testIsReliefValveClosed() throws Exception {
		startBrewing();
		if (reliefValve instanceof ReliefValveMock) {
			ReliefValveMock r = (ReliefValveMock) reliefValve;
			assert(r.valveClosed);
		}
	}
	
	@Test
	public void TestIsBolierOnAndReliefValveClosed() throws Exception {
		startBrewing();
		if (warmer instanceof WarmerMock && reliefValve instanceof ReliefValveMock) {
			WarmerMock w = (WarmerMock)warmer;
			ReliefValveMock r = (ReliefValveMock) reliefValve;
			assert(w.boilerOn);
			assert(r.valveClosed);
		}
	}
}
