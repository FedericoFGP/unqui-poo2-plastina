package tp6;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import javax.management.RuntimeErrorException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import ar.edu.unq.po2.tp6.Carta;

class testCarta {
	Carta dosDePicasNegras;
	Carta cincoDeTrebolRojas;
	Carta dosDeCopasNegras;
	Carta dosDeDiamantesNegras;
	Carta dosDeTrebolesNegras;
	Carta cincoDePicasRojas;
	Carta sieteDePicasRojas;
	ExpectedException expectedEx;
	
	Carta cartaMock1;
	
	
	
	@BeforeEach
	void setUp(){
		dosDePicasNegras = new Carta("2", "P", Carta.Color.NEGRO);
		cincoDeTrebolRojas = new Carta("5", "T", Carta.Color.ROJO);
		dosDeDiamantesNegras = new Carta("2", "D", Carta.Color.NEGRO);
		cincoDePicasRojas = new Carta("5","P", Carta.Color.ROJO);
		expectedEx = ExpectedException.none();
		
		cartaMock1 = mock(Carta.class);
	}
	
	
	@Test
	void testCartaMayorAOtra(){
		assertTrue(cincoDePicasRojas.esMayorQue(dosDePicasNegras));
		assertFalse(dosDePicasNegras.esMayorQue(cincoDePicasRojas));
	}
	
	@Test
	void testGetPalo() {
		assertEquals("P", cincoDePicasRojas.getPalo());
	}
	
	@Test
	void testGetValor() {
		assertEquals("5", cincoDePicasRojas.getValor());
	}
	
	@Test
	void testGetColor() {
		assertEquals(Carta.Color.ROJO, cincoDePicasRojas.getColor());
	}
	
	@Test
	void testObtenerValorCartaEspecial() {
		assertEquals(11, cincoDePicasRojas.obtenerValorCartaEspecial("J"));
		assertEquals(12, cincoDePicasRojas.obtenerValorCartaEspecial("Q"));
		assertEquals(13, cincoDePicasRojas.obtenerValorCartaEspecial("K"));

	}
	
	@Test
	void testObtenerValorCartaEspecialExcepcion() throws Exception {
		// Exercise
		Throwable exception = assertThrows(RuntimeException.class, () -> {
				cincoDePicasRojas.obtenerValorCartaEspecial("F");
			}
		);
		
		// Verify
		assertEquals("No coincide con ninguna carta especial", exception.getMessage());
	}
	
	@Test 
	void testMismoPaloQue() {
		assertTrue(cincoDePicasRojas.mismoPaloQue(dosDePicasNegras));
	}
	
	@Test 
	void testNoTieneMismoPaloQue() {
		assertFalse(cincoDePicasRojas.mismoPaloQue(dosDeDiamantesNegras));
	}
	
	
	@Test
	void testSetearValorCorrecto() {
		assertEquals(10, cincoDePicasRojas.setearValor("10"));
		assertEquals(1, cincoDePicasRojas.setearValor("1"));
	}
	
	@Test
	void testSetearValorNumericoIncorrecto() {
		// Exercise
		Throwable exception = assertThrows(RuntimeException.class, () -> {
				cincoDePicasRojas.setearValor("11");
			}
		);
		
		// Verify
		assertEquals("El valor es numerico pero no corresponde a una carta de Poker.", exception.getMessage());
	}
	
	@Test
	void testSetearValorEspecialCorrecto() {
		assertEquals(11, cincoDePicasRojas.setearValor("J"));
	}
	
	@Test
	void testSetearValorEspecialIncorrecto() {
		// Exercise
		Throwable exception = assertThrows(RuntimeException.class, () -> {
				cincoDePicasRojas.setearValor("P");
			}
		);
		
		// Verify
		assertEquals("El valor no es numerico ni coincide con alguna carta de Poker.", exception.getMessage());
	}
	
	@Test
	void testGetColorDescripcion() {
		assertEquals(Carta.Color.ROJO.getDescripcion(), cincoDePicasRojas.getColor().getDescripcion());
	}
}
