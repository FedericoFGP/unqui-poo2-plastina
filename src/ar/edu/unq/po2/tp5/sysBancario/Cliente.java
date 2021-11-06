package ar.edu.unq.po2.tp5.sysBancario;

import java.time.LocalDate;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private LocalDate edad;
	private double sueldoNeto;
	private IPropiedad propiedad;
	
	public Cliente(String nombre, String apellido, String direccion, LocalDate edad, double sueldoNeto){
		this.nombre = nombre;
		this.apellido = apellido; 
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNeto = sueldoNeto;
	}
	
	public int getEdad() {
		LocalDate now = LocalDate.now(); 
		return now.getYear() - this.edad.getYear();
	}
	
	public double getSueldoNeto() {
		return this.sueldoNeto;
	}
	
	public double getSueldoNetoAnual() {
	// Se incluyen los dos SAC
		return this.getSueldoNeto() * 13;
	}
	
	public void solicitarCredito(){
		
	}
}
