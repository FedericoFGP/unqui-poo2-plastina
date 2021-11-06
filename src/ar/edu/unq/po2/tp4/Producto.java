package ar.edu.unq.po2.tp4;

import java.util.function.BooleanSupplier;

public class Producto {
	private String nombre;
	private double precio;
	private boolean preciosCiudados = false;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean preciosCiudados) {
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCiudados = preciosCiudados;
	}
	public double getPrecio() {
		return precio;
	}
	public String getNombre() {
		return nombre;
	}
	
	public boolean esPrecioCuidado() {
		return this.preciosCiudados;
	}

	public void aumentarPrecio(double aumento) {
		this.precio = this.precio + aumento;
	}
}
