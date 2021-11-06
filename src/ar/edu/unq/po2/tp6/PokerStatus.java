package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PokerStatus {
	// las cartas pueden ser P, C, D , T y numeros del 1 al 10 mas J, Q y K.
	// Se da poker cuando se tienen 4 valores iguales
	
	public PokerStatus() {
	//	mano = new Mano();
	}
	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		ArrayList<String> cartas =  new ArrayList<String>(Arrays.asList(carta1,carta2,carta3,carta4,carta5));
		return this.hayPoker(cartas);
	}
	
	public String obtenerPaloDe(String carta) {
		return carta.substring(carta.length() - 1);
	}
	
	public String obtenerValorDe(String carta) {
		return carta.substring(0, carta.length() - 1);
	}
	
	public boolean hayPoker(ArrayList<String> cartas) {
		ArrayList<String> valores = new ArrayList<String>();
		for (String carta : cartas) {
			valores.add(this.obtenerValorDe(carta));
		}
		// Primer intento -> valores.stream().filter(e -> Collections.frequency(valores, e) > 1 ).collect(Collectors.toList()).size() >= 4; 
		return valores.stream().collect(Collectors.groupingBy(
				e -> this.obtenerPaloDe(e),Collectors.counting())
				)
				.values()
					.stream()
						.anyMatch(
								e-> e >= 4
		);
	}
	
}
