package ar.edu.unq.po2.tp2;


import java.util.Date;


public class EmpleadoContratado extends Empleado{
	Date fechaFinalizacion;
	Integer extras;
	
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, Date fechaNac, Float sueldoBasico, Date fechaFinalizacion, Integer extras) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
		this.fechaFinalizacion = fechaFinalizacion;
		this.extras = extras;	
	}
	
	
	private Float obraSocial() {
		return this.edad() > 50 ? this.sueldoBruto() + 25 : this.sueldoBruto() ;
	}
	
	private Float aportes() {
		return this.sueldoBruto() * (float) 0.10 + this.retencionHora();
	}
	
	private Float retencionHora() {
		return extras > 0 ? (float) extras * 5 : 0;
	}
	
	private Float remuneracionExtra() {
		return (float) extras * 40;
	}
	
	@Override
	public Float retenciones() {
		return this.obraSocial() + this.aportes();
	}
	
	@Override
	public Float sueldoBruto() {
		return this.getSueldoBasico() + this.remuneracionExtra();
	}

	@Override
	public void desgloce(ReciboDeHaberes recibo) {
		recibo.agregarConcepto("sueldo basico", this.getSueldoBasico());
		recibo.agregarConcepto("asignacion por hijo/s",this.remuneracionExtra()); 
		recibo.agregarConcepto("obra social", this.obraSocial());
		recibo.agregarConcepto("ret. hijos", this.retencionHora());
		recibo.agregarConcepto("aportes", this.aportes());
	}

}
