import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testPokerSatus {
	String dosDeCopas;
	String dosDeDiamantes;
	String dosDeTreboles;
	String dosDePicas;
	
	
	@BeforeEach
	void setUp() {
		dosDeCopas = "2C";
		dosDePicas = "2P";
		dosDeDiamantes = "2D";
		dosDeTreboles = "2T";
		
		PokerStatus status = new PokerStatus();
		
	}
	
	@Test
	void test() {
		assertTrue(status.verificar(dosDeCopas,dosDePicas, dosDeCopas, dosDeDiamantes, dosDeTreboles));
	}

}
