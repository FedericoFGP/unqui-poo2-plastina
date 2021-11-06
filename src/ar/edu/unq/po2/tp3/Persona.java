package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	
	public Persona(String nombre, String apellido, LocalDate fechaNac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
	}
	
	
	public int getEdad() {
		return LocalDate.now().getYear() - this.fechaNac.getYear();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getNombreCompleto() {
		return this.nombre + " " + this.getApellido();
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getFechaNac() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return this.fechaNac.format(formatter);
	}
	
	//Si un objeto le pide algun getter a Persona no conoce su implementacion, esto se conoce como encapsulamiento.
	
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	
}
