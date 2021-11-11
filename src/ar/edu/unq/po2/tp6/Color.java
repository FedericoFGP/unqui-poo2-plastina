package ar.edu.unq.po2.tp6;

public enum Color {
	NEGRO("NEGRO"),ROJO("ROJO");
	String descripcion;
	
	Color(String string){
		this.descripcion = string;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
}
