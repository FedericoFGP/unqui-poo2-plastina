package tp7.Composite.WarcraftTest;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Composite.war.Caballero;

class PersonajeTest {
	Caballero personaje;
	Point punto1;
	
	@BeforeEach
	void setUp() {
		personaje = new Caballero();
		punto1 = new Point(3,3);
	}
	
	@Test
	void elPersonajePuedeCaminar() {
		personaje.caminarAPosicion(punto1);
		assertEquals(punto1, personaje.getUbicacion());
	}

}
