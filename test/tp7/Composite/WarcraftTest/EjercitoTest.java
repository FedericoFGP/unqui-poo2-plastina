package tp7.Composite.WarcraftTest;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Composite.war.Caballero;
import ar.edu.unq.po2.tp7.Composite.war.Ingeniero;
import ar.edu.unq.po2.tp7.Composite.war.Ejercito;
import ar.edu.unq.po2.tp7.Composite.war.ICaracter;

class EjercitoTest {

	Caballero tirion;
	Caballero arthas;
	Caballero caballero;
	Ingeniero ingeniero;
	Ejercito army;
	
	Point punto1;
	Point punto2;
	Point punto3;
	
	@BeforeEach
	void setUp() {
		tirion = new Caballero();
		arthas = new Caballero();
		caballero = new Caballero();
		ingeniero = new Ingeniero();
		army = new Ejercito();
		
		punto1 = new Point(3,3);
		punto2 = new Point(3,2);
		punto3 = new Point(1,1);
	}
	
	@Test
	void ubicacionInicialDelEjercitoigualA00Test() {
		army.añadirPersonaje(tirion);
		army.añadirPersonaje(ingeniero);
		army.añadirPersonaje(arthas);
		Point puntoInicial = new Point(0,0);
		assertEquals(puntoInicial, army.getUbicacion());
	}
	
	@Test
	void laUbicacionInicialDelEjercitoesIgualA00Test() {
		Point puntoInicial = new Point(0,0);
		army.añadirPersonaje(tirion);
		army.añadirPersonaje(ingeniero);
		army.añadirPersonaje(arthas);
		assertEquals(puntoInicial, army.getUbicacion());
		//assertNotEquals(punto3, tirion.getUbicacion());
	}

	@Test
	void iniciarUBicacionTest() {
		Point puntoInicial = new Point(0,0);
		army.añadirPersonaje(tirion);
		army.añadirPersonaje(ingeniero);
		army.añadirPersonaje(arthas);
		army.iniciarUbicacion();
		assertEquals(puntoInicial, army.getUbicacion());
		//assertNotEquals(punto3, tirion.getUbicacion());
	}

	@Test
	void falsoArmyEsIgualAlEjercitoTest() {
		ArrayList<ICaracter> falsoArmy = new ArrayList<ICaracter>();
		falsoArmy.add(tirion);
		falsoArmy.add(ingeniero);
		falsoArmy.add(arthas);
		
		army.añadirPersonaje(tirion);
		army.añadirPersonaje(ingeniero);
		army.añadirPersonaje(arthas);
		assertEquals(falsoArmy, army.getPersonajesDelEjercito());
		//assertNotEquals(punto3, tirion.getUbicacion());
	}
	
	@Test
	void tamhanoDelEjercitoEsIgualA4Test() {
		army.añadirPersonaje(tirion);
		army.añadirPersonaje(ingeniero);
		army.añadirPersonaje(arthas);
		army.añadirPersonaje(caballero);
		assertEquals(4, army.tamanhoDelEjercito());
		//assertNotEquals(punto3, tirion.getUbicacion());
	}
	
	@Test
	void moverElEjercitoTest() {
		army.añadirPersonaje(tirion);
		//army.añadirPersonaje(ingeniero);
		army.añadirPersonaje(arthas);
		
		army.caminarAPosicion(punto1);
		
		assertEquals(punto1, army.getUbicacion());
		//assertNotEquals(punto3, tirion.getUbicacion());
	}
}
