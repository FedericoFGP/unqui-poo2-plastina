package ar.edu.unq.po2.tp2;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

public class ReciboDeHaberes {
	String nombre;
	String direccion;
	String estadoCivil;
	Date fechaEmision;
	Float sueldoBasico;
	Float sueldoBruto;
	Map<String,Float> desgloce;
	
	public ReciboDeHaberes(
			String nombre, 
			String direccion, 
			Float sueldoBruto, 
			Float sueldoNeto){
		this.nombre = nombre;
		this.direccion = direccion;
		this.sueldoBruto = sueldoBruto;
		this.sueldoBasico = sueldoNeto;
		this.fechaEmision = new Date();
		this.desgloce = new HashMap<String, Float>();
	}
	
	public void agregarConcepto(String concepto,Float valor){
		desgloce.put(concepto, valor);
	}
	
	public Map<String,Float> getDesgloce(){
		return this.desgloce;
	}
}
