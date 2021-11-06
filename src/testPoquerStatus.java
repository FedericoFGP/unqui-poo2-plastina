import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.PokerStatus;

class testPoquerStatus {
	String dosDeCopas;
	String dosDeDiamantes;
	String dosDeTreboles;
	String dosDePicas;
	String cincoDePicas;
	String sieteDePicas;
	PokerStatus status;
	
	@BeforeEach
	void setUp() {
		dosDeCopas = "2C";
		dosDePicas = "2P";
		dosDeDiamantes = "2D";
		dosDeTreboles = "2T";
		cincoDePicas = "5P";
		sieteDePicas = "7P";
		
		status = new PokerStatus();
		
	}
	
	@Test
	void test() {
		assertFalse(status.verificar(dosDeCopas,dosDePicas, dosDeDiamantes, sieteDePicas ,cincoDePicas));
		assertTrue(status.verificar(dosDeCopas,dosDePicas, dosDeDiamantes, sieteDePicas ,dosDeTreboles));
	}


}
