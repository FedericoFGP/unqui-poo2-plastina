package ar.edu.unq.po2.tp8.Sueldos;

public abstract class Empleado {
	
	protected double sueldoBasico;
	
	public Empleado() {
		
	}
	
	public double sueldo() {
	//El template method
	// Empleado == clase abstracta
	// ETemporario, EPLanta y EPasante == clases concretas
	//Operaciones primitivas sueldoBruto y cargas(extras)
		return this.sueldoBruto() - this.descuentos();
	}
	
	public abstract double sueldoBruto();
	
	public abstract double cargas();
	
	public double sueldoBasico() {
		return this.sueldoBasico;
	}

	
	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	private double descuentos() {
		return this.sueldoBruto() * 0.13;
	}
}
