package ar.edu.unq.po2.tp2;


import java.util.ArrayList;
import java.util.Date;


public abstract class Empleado {
	public static final Float getSueltoNeto = null;
	String nombre;
	String direccion;
	String estadoCivil;
	Date fechaNac;
	Float sueldoBasico;
	
	public abstract void desgloce(ReciboDeHaberes recibo);
	

	
	public Integer edad() {	
		Date d = new Date();
		Integer year = d.getYear() + 1900;
		Integer edad = (year - (this.fechaNac.getYear()));
		return edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public Float getSueldoBasico() {
		return this.sueldoBasico;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public Date getFechaNac() {
		return fechaNac;
	}
	
	public  Float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public abstract Float retenciones();

	public abstract Float sueldoBruto();


}




