package tp6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.Carta;
import ar.edu.unq.po2.tp6.Color;
import ar.edu.unq.po2.tp6.Jugada;
import ar.edu.unq.po2.tp6.Mano;
import ar.edu.unq.po2.tp6.Palo;
import ar.edu.unq.po2.tp6.PokerStatus;
import ar.edu.unq.po2.tp6.Valor;


class testPokerStatus2 {

	String dosDeCopas;
	String dosDeDiamantes;
	String dosDeTreboles;
	String dosDePicas;
	String cincoDePicas;
	String sieteDePicas;
	PokerStatus status;
	
	Carta cartaMock1;
	Carta cartaMock2;
	Carta cartaMock3;
	Carta cartaMock4;
	Carta cartaMock5;
	
	Mano manoTest1;
	Mano manoTest2;
	
	@BeforeEach
	void setUp() {
		dosDeCopas = "2C";
		dosDePicas = "2P";
		dosDeDiamantes = "2D";
		dosDeTreboles = "2T";
		cincoDePicas = "5P";
		sieteDePicas = "7P";
		
		cartaMock1 = mock(Carta.class);
		cartaMock2 = mock(Carta.class);
		cartaMock3 = mock(Carta.class);
		cartaMock4 = mock(Carta.class);
		cartaMock5 = mock(Carta.class);
		
		manoTest1 = new Mano(cartaMock1,cartaMock2, cartaMock3, cartaMock4 ,cartaMock5);
		manoTest2 = new Mano(cartaMock1,cartaMock2, cartaMock3, cartaMock3 ,cartaMock2);
		
		status = new PokerStatus();
	}
	
	@Test
	void testVerificarTrue() {
		
		//Exercise
		//status = new PokerStatus();
//		when(cartaMock1.getValor()).thenReturn(Valor.DOS.getValor());
//		when(cartaMock2.getValor()).thenReturn(Valor.DOS.getValor());
//		when(cartaMock3.getValor()).thenReturn(Valor.DOS.getValor());
//		when(cartaMock4.getValor()).thenReturn(Valor.DOS.getValor());
//		when(cartaMock5.getValor()).thenReturn(Valor.DOS.getValor());
		//Verify
		assertEquals(Jugada.Poker,status.verificar(manoTest1));
		
	}
	
	@Test
	void testVerificarColor() {
		//Exercise
		when(cartaMock1.getValor()).thenReturn(Valor.DOS.getValor());
		when(cartaMock2.getValor()).thenReturn(Valor.TRES.getValor());
		when(cartaMock3.getValor()).thenReturn(Valor.DOS.getValor());
		when(cartaMock4.getValor()).thenReturn(Valor.CUATRO.getValor());
		when(cartaMock5.getValor()).thenReturn(Valor.CINCO.getValor());
		
		when(cartaMock1.getPalo()).thenReturn(Palo.Pica);
		when(cartaMock2.getPalo()).thenReturn(Palo.Pica);
		when(cartaMock3.getPalo()).thenReturn(Palo.Pica);
		when(cartaMock4.getPalo()).thenReturn(Palo.Pica);
		when(cartaMock5.getPalo()).thenReturn(Palo.Pica);

		when(cartaMock1.getColor()).thenReturn(Color.NEGRO);
		when(cartaMock2.getColor()).thenReturn(Color.NEGRO);
		when(cartaMock3.getColor()).thenReturn(Color.NEGRO);
		when(cartaMock4.getColor()).thenReturn(Color.NEGRO);
		when(cartaMock5.getColor()).thenReturn(Color.NEGRO);

		//Verify
		assertEquals(Jugada.Color,status.verificar(manoTest1));
	}
	
	@Test
	void testVerificarTrio() {
		
		//Exercise
		//status = new PokerStatus();
		when(cartaMock1.getValor()).thenReturn(Valor.DOS.getValor());
		when(cartaMock2.getValor()).thenReturn(Valor.DOS.getValor());
		when(cartaMock3.getValor()).thenReturn(Valor.TRES.getValor());
		when(cartaMock4.getValor()).thenReturn(Valor.CUATRO.getValor());
		when(cartaMock5.getValor()).thenReturn(Valor.DOS.getValor());
		//Verify
	    assertEquals(Jugada.Trio,status.verificar(manoTest1));
		
	}
	
	@Test
	void testNoHayJugada() {
		
		//Exercise
		//status = new PokerStatus();
		when(cartaMock1.getValor()).thenReturn(Valor.DOS.getValor());
		when(cartaMock2.getValor()).thenReturn(Valor.TRES.getValor());
		when(cartaMock3.getValor()).thenReturn(Valor.CUATRO.getValor());
		when(cartaMock4.getValor()).thenReturn(Valor.CUATRO.getValor());
		when(cartaMock5.getValor()).thenReturn(Valor.CINCO.getValor());
		
		when(cartaMock1.getPalo()).thenReturn(Palo.Pica);
		when(cartaMock2.getPalo()).thenReturn(Palo.Diamante);
		when(cartaMock3.getPalo()).thenReturn(Palo.Corazon);
		when(cartaMock4.getPalo()).thenReturn(Palo.Trebol);
		when(cartaMock5.getPalo()).thenReturn(Palo.Pica);

		when(cartaMock1.getColor()).thenReturn(Color.NEGRO);
		when(cartaMock2.getColor()).thenReturn(Color.ROJO);
		when(cartaMock3.getColor()).thenReturn(Color.NEGRO);
		when(cartaMock4.getColor()).thenReturn(Color.ROJO);
		when(cartaMock5.getColor()).thenReturn(Color.NEGRO);
		
		//Verify
	    assertEquals(Jugada.Nada,status.verificar(manoTest1));
		
	}
	
	@Test
	void testLaManoGanadora() {
		//Exercise
		when(cartaMock1.getValor()).thenReturn(Valor.DOS.getValor());
		when(cartaMock2.getValor()).thenReturn(Valor.DOS.getValor());
		when(cartaMock3.getValor()).thenReturn(Valor.DOS.getValor());
		when(cartaMock4.getValor()).thenReturn(Valor.DOS.getValor());
		when(cartaMock5.getValor()).thenReturn(Valor.DOS.getValor());
		
		status.laMano_LeGanadaA_(manoTest1, manoTest2);
		status.laMano_LeGanadaA_(manoTest2, manoTest1);
	}
}
