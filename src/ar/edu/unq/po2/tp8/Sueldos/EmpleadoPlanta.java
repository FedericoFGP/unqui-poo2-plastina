package ar.edu.unq.po2.tp8.Sueldos;

public class EmpleadoPlanta extends Empleado{
	private int hijos;
	private int valorPorHijo;
	
	public EmpleadoPlanta(int hijos){
		this.hijos = hijos;
		this.sueldoBasico = 3000;
		this.valorPorHijo = 150;
	}
	
	@Override
	public double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.sueldoBasico + this.cargas();
	}

	@Override
	public double cargas() {
		// TODO Auto-generated method stub
		return hijos * 150 ;
	}
	
}
