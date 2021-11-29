package tp7.Composite.cultivo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Composite.cultivo.CampoCultivoMixto;
import ar.edu.unq.po2.tp7.Composite.cultivo.CampoCultivoSolo;

class CultivoTest {
	CampoCultivoSolo campoSoja;
	CampoCultivoSolo campoTrigo;
	CampoCultivoSolo campoSinGanancias;
	CampoCultivoMixto campoMixto;
	
	
	
	@BeforeEach
	void setUp() {
		//Representacion de campo de Soja.
		campoSoja = new CampoCultivoSolo(500);
		campoTrigo = new CampoCultivoSolo(300);
		campoSinGanancias = new CampoCultivoSolo(0);
		campoMixto = new CampoCultivoMixto();
	
	}
	
	
	@Test
	void campoSoloTieneGanancias() {
		assertEquals(campoSoja.gananciaAnual(), 500);
	}
	
	@Test
	void campoSoloNoTieneGanancias() {
		assertEquals(campoSinGanancias.gananciaAnual(), 0);
	}

	@Test
	void campoMixtoTiene800DeGanancias() {
		campoMixto.registrarParcela(campoSoja);
		campoMixto.registrarParcela(campoTrigo);
		assertEquals(campoMixto.gananciaAnual(), 800);
	}
	
	@Test
	void campoMixtoTiene300DeGanancias() {
		// Solo tiene 1 parcela de trigo, por eso debe ganar 300.
		campoMixto.registrarParcela(campoTrigo);
		assertEquals(campoMixto.gananciaAnual(), 300);
	}
	
	@Test
	void campoMixtoNoTieneGanancias() {
		assertEquals(campoMixto.gananciaAnual(), 0);
	}
	
	@Test
	void campoMixtoTieneParcelaDeSoja() {
		campoMixto.registrarParcela(campoSoja);
		assertEquals(campoSoja, campoMixto.getParcelas().get(0));
	}
}
