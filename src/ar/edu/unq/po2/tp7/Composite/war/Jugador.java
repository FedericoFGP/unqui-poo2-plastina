package ar.edu.unq.po2.tp7.Composite.war;

import java.awt.Point;

public class Jugador {
	public ICaracter personaje;
	
	public Jugador(ICaracter personaje) {
		this.personaje = personaje;
	}
	
	public void moverseALaPosicion(Point punto) {
		this.personaje.caminarAPosicion(punto);
	}
}
