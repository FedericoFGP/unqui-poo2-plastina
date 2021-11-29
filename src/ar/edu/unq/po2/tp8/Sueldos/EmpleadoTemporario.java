package ar.edu.unq.po2.tp8.Sueldos;

public class EmpleadoTemporario extends Empleado{
	private boolean tieneHijos; 
	private boolean casadoa;
	private int horasTrabajadas;
	private double valorHora;
	
	public EmpleadoTemporario(boolean tieneHijos, boolean estaCasado, int horas) {
		this.tieneHijos = tieneHijos;
		this.casadoa = estaCasado; 
		this.horasTrabajadas = horas;
		this.sueldoBasico = 1000;
		this.valorHora = 5;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cargas() {
		// TODO Auto-generated method stub
		return this.estaCasado() || this.tieneHijos ? 150  : 0;
	}

	@Override
	public double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.horasTrabajadas * this.valorHora + this.cargas();
	}
	
	public boolean estaCasado() {
		return this.casadoa;
	}
	
	public boolean tieneHijos() {
		return this.tieneHijos;
	}
}
