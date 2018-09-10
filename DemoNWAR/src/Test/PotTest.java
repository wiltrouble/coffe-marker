package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import coffeeMaker.Pot;

class PotTest {

	@Test
	void test() {
		
		
	Pot ppot1 = new Pot();
	
	ppot1.estadoPot();
	
	ppot1.ponerPotEnContenedor();
	
	ppot1.cargarPot(3);
	
	ppot1.estadoPot();
	
	ppot1.ponerPotEnContenedor();
	
	ppot1.sacarPot();
	
	
	
	}

}
