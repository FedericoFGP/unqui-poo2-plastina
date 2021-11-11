package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.Arrays;

public class Carta {
	private Palo palo;
	private Valor valor;
	private Color color;

	
	public Carta(Valor valor, Palo palo, Color color) {
		this.palo = palo;
		this.valor = valor;
		this.color = color;
	}
	
	public Palo getPalo() {
		return this.palo;
	}

	public int getValor() {
		return valor.getValor();
	}
	
	public Color getColor() {
		return this.color;
	}

//	public int setearValor(String valor) {
//		int valor_num = 0;
//		boolean success = true;
//		
//		//Redefinir este metodo
//		
//		try {
//			valor_num = Integer.parseInt(valor);
//		} catch (Exception e){
//			success = false;
//		}
//		
//		if(success && valor_num <= 10) {
//			// Seteo el valor que corresponda
//				return valor_num;
//		} 
//		else if ( success && valor_num > 10) {
//			throw new RuntimeException("El valor es numerico pero no corresponde a una carta de Poker.");
//		}
//		else {
//			// Si el valor no es int, chequeo
//			if (this.cartas_especiales.contains(valor)) {
//				return this.obtenerValorCartaEspecial(valor);
//			} else {
//				throw new RuntimeException("El valor no es numerico ni coincide con alguna carta de Poker.");		
//			}
//		} 
//	}
	
	public int obtenerValorCartaEspecial(String valor) {
		switch (valor.toUpperCase()) {
			case "J":
				return 11;
			case "Q":
				return 12;
			case "K":
				return 13;
			default:
				throw new RuntimeException("No coincide con ninguna carta especial");
		}
	}


	
	public boolean mismoPaloQue(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}

	public boolean esMayorQue(Carta carta) {
		return this.getValor() > carta.getValor();
	}



}
