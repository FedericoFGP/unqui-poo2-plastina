package ar.edu.unq.po2.tp4.enums;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class ActividadSemanal {
	LocalDateTime hora;
	Duration duracion;
	Deportes deporte;
	DiaDeLaSemana dia;
	
	public enum DiaDeLaSemana{
		DOMINGO,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO;
	}
	
	public enum Deportes{
		RUNNING(1),FUTBOL(2),BASKET(2),TENNIS(3),JABALINA(4);
		
		private int complejidad;
		
		Deportes(int complejidad){
			this.complejidad=complejidad;
		}

		int costoPorComplejidad() {
			return 200 * this.complejidad;
		}
		
		public int getComplejidad() {
			return this.complejidad;
		}
		
	}

	public double getCosto() {
		return this.dia == DiaDeLaSemana.LUNES 
			|| this.dia == DiaDeLaSemana.MARTES 
			|| this.dia == DiaDeLaSemana.MIERCOLES ? 500 + this.deporte.costoPorComplejidad(): 1000 + this.deporte.costoPorComplejidad();
	}
	
	public  Deportes getDeportes() {
		return deporte;
	}
	
	public Duration getDuracion() {
		return this.duracion;
	}
	
	
}
