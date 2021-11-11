package tp6;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import ar.edu.unq.po2.tp6.Color;
import ar.edu.unq.po2.tp6.Carta;
import ar.edu.unq.po2.tp6.Palo;
import ar.edu.unq.po2.tp6.Valor;

class testCarta {
	Carta dosDePicasNegras;
	Carta cincoDeTrebolRojas;
	Carta dosDeCopasNegras;
	Carta dosDeDiamantesNegras;
	Carta dosDeTrebolesNegras;
	Carta cincoDePicasRojas;
	Carta sieteDePicasRojas;
	ExpectedException expectedEx;
	

	
	
	@BeforeEach
	void setUp(){
		dosDePicasNegras = new Carta(Valor.DOS, Palo.Pica, Color.NEGRO);
		cincoDeTrebolRojas = new Carta(Valor.CINCO, Palo.Trebol, Color.ROJO);
		dosDeDiamantesNegras = new Carta(Valor.DOS, Palo.Diamante,Color.NEGRO);
		cincoDePicasRojas = new Carta(Valor.CINCO, Palo.Pica, Color.ROJO);
		expectedEx = ExpectedException.none();
		
	}
	
	
	@Test
	void testCartaMayorAOtra(){
		assertTrue(cincoDePicasRojas.esMayorQue(dosDePicasNegras));
		assertFalse(dosDePicasNegras.esMayorQue(cincoDePicasRojas));
	}
	
	@Test
	void testGetPalo() {
		assertEquals(Palo.Pica, cincoDePicasRojas.getPalo());
	}
	
	@Test
	void testGetValor() {
		assertEquals(5, cincoDePicasRojas.getValor());
	}
	
	@Test
	void testGetColor() {
		assertEquals(Color.ROJO, cincoDePicasRojas.getColor());
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
	
	
//	@Test
//	void testSetearValorCorrecto() {
//		assertEquals(10, cincoDePicasRojas.setearValor("10"));
//		assertEquals(1, cincoDePicasRojas.setearValor("1"));
//	}
//	
//	@Test
//	void testSetearValorNumericoIncorrecto() {
//		// Exercise
//		Throwable exception = assertThrows(RuntimeException.class, () -> {
//				cincoDePicasRojas.setearValor("11");
//			}
//		);
//		
//		// Verify
//		assertEquals("El valor es numerico pero no corresponde a una carta de Poker.", exception.getMessage());
//	}
//	
//	@Test
//	void testSetearValorEspecialCorrecto() {
//		assertEquals(11, cincoDePicasRojas.setearValor("J"));
//	}
//	
//	@Test
//	void testSetearValorEspecialIncorrecto() {
//		// Exercise
//		Throwable exception = assertThrows(RuntimeException.class, () -> {
//				cincoDePicasRojas.setearValor("P");
//			}
//		);
//		
//		// Verify
//		assertEquals("El valor no es numerico ni coincide con alguna carta de Poker.", exception.getMessage());
//	}
//	
//	@Test
//	void testGetColorDescripcion() {
//		assertEquals(Carta.Color.ROJO.getDescripcion(), cincoDePicasRojas.getColor().getDescripcion());
//	}
}
