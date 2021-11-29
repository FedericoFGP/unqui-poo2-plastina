package ar.edu.unq.po2.tp7.Composite.war;

import java.util.ArrayList;

import java.awt.Point;


public class Ejercito extends Personaje{
	
	private ArrayList<ICaracter> personajesDelEjercito;
	
	public Ejercito() {
		//this.iniciarUbicacion();
		this.personajesDelEjercito = new ArrayList<ICaracter>();
	}
	
	public void añadirPersonaje(ICaracter personaje) {
		this.personajesDelEjercito.add(personaje);
	}

	@Override
	public void caminarAPosicion(Point punto) {
		// TODO Auto-generated method stub
		this.personajesDelEjercito.forEach(personaje -> personaje.caminarAPosicion(punto));
	}
	
	public int tamanhoDelEjercito() {
		return this.personajesDelEjercito.size();
	}
	
	public ArrayList<ICaracter> getPersonajesDelEjercito(){
		return this.personajesDelEjercito;
	}
	
	@Override
	public void iniciarUbicacion() {
		this.personajesDelEjercito.forEach(personaje -> personaje.iniciarUbicacion());
	}
	
	public Point getUbicacion() {
		//Tomo la ubicacion del primer elemento ya que va a ser la misma en todos.
		return this.personajesDelEjercito.get(0).getUbicacion();
	}
	
}
