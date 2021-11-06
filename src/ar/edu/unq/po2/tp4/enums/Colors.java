package ar.edu.unq.po2.tp4.enums;

public class Colors {
	
	public enum Color {
		ROJO("Peligroso",10), GRIS("Sin peligro",2),AMARILLO("Moderado",4),MIEL("Riesgoso",8);
		
		String descripcion;
		int nivel;
	//	Color siguiente;
		
		Color(String descripcion, int nivel ){
			this.descripcion = descripcion;
			this.nivel = nivel;
		//	this.siguiente = this.siguienteColor();
		}
		
		public Color siguienteColor() {
			return this.ordinal() < Color.values().length - 1
		         ? Color.values()[this.ordinal() + 1]
		         : Color.values()[0];
		}
		
		public String getDescripcion() {
			return this.descripcion;
		}
		
		public int getNivel() {
			return this.nivel;
		}
	}
	
}
