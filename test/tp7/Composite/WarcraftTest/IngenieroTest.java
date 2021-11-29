package tp7.Composite.WarcraftTest;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Composite.war.Caballero;
import ar.edu.unq.po2.tp7.Composite.war.ICamino;
import ar.edu.unq.po2.tp7.Composite.war.Ingeniero;
import ar.edu.unq.po2.tp7.Composite.war.ParteDeCamino;

class IngenieroTest {
	
	Ingeniero enano;
	Point punto1;
	Point punto2;
	Point punto3;
	
	@BeforeEach
	void setUp() {
		enano = new Ingeniero();
		punto1 = new Point(3,3);
		punto2 = new Point(3,2);
		punto3 = new Point(1,1);
	}
	
	@Test
	void ubicacionInicialDelCaballeroigualA00() {
		Point puntoInicial = new Point(0,0);
		assertEquals(puntoInicial, enano.getUbicacion());
	}
	
	@Test
	void moverAlEnanoAlPunto3SinLajasTest() {
		enano.caminarAPosicion(punto1);
		assertEquals(punto1, enano.getUbicacion());
	}
	
	@Test
	void enanoTiene3Lajas() {
		enano.agregarLajas(3);

		assertTrue(enano.tieneLajas());
	}
	
	@Test
	void moverAlEnanoAlPunto3ConLajasTest() {	
		enano.agregarLajas(3);
		
		ArrayList<ICamino> lajas = new ArrayList<ICamino>();
		ICamino laja = new ParteDeCamino();
		ICamino laja1 = new ParteDeCamino();
		ICamino laja2 = new ParteDeCamino();
		
		enano.caminarAPosicion(punto1);
	
		lajas.add(laja);

		assertEquals(lajas.size(), enano.getCaminoConstruido().size());
		//assertEquals(punto1, enano.getUbicacion());
	}

}
