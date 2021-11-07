package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.PokerStatus;

class testPokerStatus2 {

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
		

		
	}
	
	@Test
	void testVerificarTrue() {
		
		//Exercise
		status = new PokerStatus();
		
		//Verify
		assertEquals("No hay",status.verificar(dosDeCopas,dosDePicas, dosDeDiamantes, sieteDePicas ,cincoDePicas));
		assertEquals("Poker",status.verificar(dosDeCopas,dosDePicas, dosDeDiamantes, sieteDePicas ,dosDeTreboles));
	}

}
