package ar.edu.unq.po2.tp3;


import java.util.ArrayList;


public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> equipo;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.equipo = new ArrayList<Persona>();
	}
	
	public void ingresarIntegrante(Persona p) {
		this.equipo.add(p);
	}
	
	public void promedioDeEdad() {
		double prom = equipo.stream().mapToDouble(Persona::getEdad).sum() / this.equipo.size();
		System.out.println(prom);
	}
	
}
