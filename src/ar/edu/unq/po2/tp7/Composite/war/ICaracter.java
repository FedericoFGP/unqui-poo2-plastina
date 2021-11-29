package ar.edu.unq.po2.tp7.Composite.war;

import java.awt.Point;

public interface ICaracter {
	public void caminarAPosicion(Point punto);
	public void iniciarUbicacion();
	public Point getUbicacion();
}
