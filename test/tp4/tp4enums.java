package tp4;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp4.enums.Colors;


class tp4enums {
	

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(Colors.Color.ROJO.getDescripcion(),"Peligroso");
		assertEquals(Colors.Color.AMARILLO.getNivel(), 4);
		assertEquals(Colors.Color.MIEL.siguienteColor(),Colors.Color.ROJO );
	}

}
