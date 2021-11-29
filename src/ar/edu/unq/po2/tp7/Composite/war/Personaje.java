package ar.edu.unq.po2.tp7.Composite.war;

import java.awt.Point;

public abstract class Personaje implements ICaracter{
	protected Point ubicacion;
	
	public void caminarAPosicion(Point punto) {
		// TODO Auto-generated method stub	
		this.ubicacion = punto;
	}
	
	public Point getUbicacion() {
		return this.ubicacion;
	}
	
	public void iniciarUbicacion() {
		this.ubicacion = new Point(0,0);
	}
}
