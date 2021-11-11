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

	public PokerStatus() {

	}
	public Jugada verificar(Mano mano) {
	
		return this.jugada(mano);
	}
	
	public Jugada jugada(Mano cartas) {
		//Redifinir este metodo
		return cartas.jugadaEnMano();
	}
	
	public String laMano_LeGanadaA_(Mano mano1, Mano mano2) {
		if (mano1.jugadaEnMano().ordinal() < mano2.jugadaEnMano().ordinal()) {
			return "La mano1 es jugada ganadora con" + mano1.jugadaEnMano().toString();
		} else if (mano2.jugadaEnMano().ordinal() < mano1.jugadaEnMano().ordinal()) {
			return "La mano2 tiene jugada ganadora con " + mano2.jugadaEnMano().toString();
		} else {
			return mano1.esMejorQue(mano2).toString() + " es ganadora";
		}
	}
	

	
}
