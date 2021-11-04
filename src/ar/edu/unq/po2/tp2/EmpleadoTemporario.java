package ar.edu.unq.po2.tp2;

import java.util.Date;

public class EmpleadoTemporario extends Empleado{
	private int nroContrato;
	private String medioDePago;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, Date fechaNac, Float sueldoBasico, int nroContrato, String medioDePago) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
		this.nroContrato = nroContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public void desgloce(ReciboDeHaberes recibo) {
		// TODO Auto-generated method stub
		recibo.agregarConcepto("sueldo basico", this.getSueldoBasico());
		recibo.agregarConcepto("Gastos administrativos contractuales",this.retenciones()); 
	}

	@Override
	public Float retenciones() {
		return (float) 50;
	}

	@Override
	public Float sueldoBruto() {
		return this.sueldoBasico;
	}
	
	
}
