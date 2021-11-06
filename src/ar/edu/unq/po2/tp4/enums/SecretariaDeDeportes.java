package ar.edu.unq.po2.tp4.enums;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class SecretariaDeDeportes {
	List<ActividadSemanal> oferta;
	
	public SecretariaDeDeportes() {
		this.oferta = new ArrayList<ActividadSemanal>();
	}
	
	public List<ActividadSemanal> todasLasActividadesDeFutbol(){
		return this.oferta.stream().filter(actividad -> actividad.getDeportes() == ActividadSemanal.Deportes.FUTBOL).collect(Collectors.toList());
	}
	
	
	public List<ActividadSemanal> actividadesConComplejidad(int complejidad){
		return this.oferta.stream().filter(actividad -> actividad.deporte.getComplejidad() == complejidad).collect(Collectors.toList());
	}
	
	public Duration totalHoras() {
		Duration dur = Duration.ZERO;
		return this.oferta.stream().map(ActividadSemanal::getDuracion).reduce(dur,(subtotal, el) -> subtotal.plus(el));
	}
	
	
	/*
	 * public ActividadSemanal actividadConMenorCosto() { return
	 * this.oferta.stream().mapToDouble(ActividadSemanal::getCosto).reduce(null); }
	 */
	
	public Map<ActividadSemanal.Deportes,ActividadSemanal> actividadMasEconomica(){
		return null;
	}
	
	
	
}
