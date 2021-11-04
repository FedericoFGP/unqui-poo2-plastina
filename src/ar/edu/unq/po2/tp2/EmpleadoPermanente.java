package ar.edu.unq.po2.tp2;

import java.util.Date;

public class EmpleadoPermanente extends Empleado{
	Integer hijos;
	Integer anhos;

	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, Date fechaNac, Float sueldoBasico, Integer hijos, Integer anhos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
		this.hijos = hijos;
		this.anhos = anhos;	
	}
	
	@Override
	public Float retenciones() {
		return this.obraSocial() + this.retencionHijos() + this.aportes();
	}
	
	@Override
	public Float sueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar() + this.antiguedad();
	}
	
	private Float antiguedad() {
		return (float) anhos * 50;
	}
		
	private Float salarioFamiliar() {
		return this.asignacionHijos() + this.asignacionConyugue();
	}
	
	private Float asignacionConyugue() {
		return this.tieneConyugue() ? (float) 150 : (float) 0 ;
	}
	
	private Boolean tieneConyugue() {
		return estadoCivil.equalsIgnoreCase("soltero") || estadoCivil.equalsIgnoreCase("soltera") ;
	}
	private Float asignacionHijos() {
		return (float) hijos * 150;
	}
	
	private Float retencionHijos() {
		return (float) hijos * 20;
	}
	
	private Float aportes(){
		return  this.sueldoBruto() * (float) 0.15;
	}
	
	private Float obraSocial() {
		return this.sueldoBruto() * (float) 0.10;  
	}
	
	@Override
	public void desgloce(ReciboDeHaberes recibo) {
		recibo.agregarConcepto("sueldo basico", this.getSueldoBasico());
		recibo.agregarConcepto("asignacion por hijo/s",this.asignacionHijos()); 
		recibo.agregarConcepto("asignacion por hijo/s", this.asignacionConyugue());		
		recibo.agregarConcepto("antiguedad", this.antiguedad());
		recibo.agregarConcepto("obra social", this.obraSocial());
		recibo.agregarConcepto("ret. hijos", this.retencionHijos());
		recibo.agregarConcepto("aportes", this.aportes());
	}
}
