package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Mano {
	ArrayList<Carta> cartas;
	
	public Mano(Carta carta1, Carta carta2 , Carta carta3, Carta carta4, Carta carta5) {
		cartas = new ArrayList<Carta>(Arrays.asList(carta1,carta2,carta3,carta4,carta5));
	}
	
	public Jugada jugadaEnMano() {
		if (this.hayPoker(cartas)) {
			return Jugada.Poker;
		} else if(this.hayColor(cartas)) {
			return Jugada.Color;
		} else if (this.hayTrio(cartas)) {
			return Jugada.Trio;
		} else {
			return Jugada.Nada;
		}
	}
	
	public boolean hayPoker(ArrayList<Carta> cartas) {
		return cartas.stream().map(Carta::getValor).collect(Collectors.groupingBy(
				e -> e,Collectors.counting())).values().stream().anyMatch(e-> e >= 4);
	}
	
	public boolean hayColor(ArrayList<Carta> cartas) {
		return cartas.stream().map(Carta::getPalo).allMatch(
					e -> e == cartas.get(1).getPalo() && cartas.get(1).getPalo() != null ) && 
				cartas.stream().map(Carta::getColor).allMatch(
					e -> e == cartas.get(1).getColor()&& cartas.get(1).getPalo() != null 
				);
		
	}
	
	public boolean hayTrio(ArrayList<Carta> cartas) {
		return cartas.stream().map(Carta::getValor).collect(Collectors.groupingBy(
				e -> e,Collectors.counting())).values().stream().anyMatch(e-> e >= 3);
	}

	public Mano esMejorQue(Mano mano2) {
		int valorMano1 = this.cartas.stream().mapToInt(Carta::getValor).sum();
		int valorMano2 = mano2.cartas.stream().mapToInt(Carta::getValor).sum();		
		return  valorMano1 > valorMano2 ? this : mano2;
	}
	
}
