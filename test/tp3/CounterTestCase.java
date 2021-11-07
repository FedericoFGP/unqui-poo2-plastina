package tp3;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.*;

class CounterTestCase {
	
	Counter contador = new Counter();
	//La clase counter ya viene con la lista 1,2,4,3,5,6,7,8,9,10,20,30,40,50,60,70,33,994 como el atributo "list"
	
	@Test
	void numerosImpares() {
		assertEquals(6, contador.cantidadDeImpares());
	}
	
	@Test
	void numerosPares() {
		assertEquals(11, contador.cantidadDePares());
	}
	
	@Test
	void multiplos() {
		assertEquals(11, contador.cantidadDeMultiplosDe(2));
	}

}
