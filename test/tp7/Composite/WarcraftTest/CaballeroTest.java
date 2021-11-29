package tp7.Composite.WarcraftTest;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Composite.war.Caballero;

class CaballeroTest {
	
	Caballero tirion;
	Point punto1;
	Point punto2;
	Point punto3;
	
	@BeforeEach
	void setUp() {
		tirion = new Caballero();
		punto1 = new Point(3,3);
		punto2 = new Point(3,2);
		punto3 = new Point(1,1);
	}
	
	@Test
	void ubicacionInicialDelCaballeroigualA00() {
		Point puntoInicial = new Point(0,0);
		assertEquals(puntoInicial, tirion.getUbicacion());
	}
	
	@Test
	void moverCaballero() {
		tirion.caminarAPosicion(punto3);
		assertEquals(punto3, tirion.getUbicacion());
		//assertNotEquals(punto3, tirion.getUbicacion());
		
	}

}
