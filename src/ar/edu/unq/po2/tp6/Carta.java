package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.Arrays;

public class Carta {
	private String palo;
	private int valor;
	private Color color;
	ArrayList<String> cartas_especiales;
	
	public enum Color{
		NEGRO("NEGRO"),ROJO("ROJO");
		String descripcion;
		
		Color(String string){
			this.descripcion = string;
		}
		
		public String getDescripcion() {
			return this.descripcion;
		}
	}
	
	public Carta(String valor, String palo, Color color) {
		this.palo = palo;
		this.valor = this.setearValor(valor);
		this.color = color;
		this.cartas_especiales = new ArrayList<String>(Arrays.asList("J","Q","K"));
	}
	
	public String getPalo() {
		return palo;
	}

	public String getValor() {
		return Integer.toString(valor);
	}
	
	public Color getColor() {
		return color;
	}

	public int setearValor(String valor) {
		int valor_num = 0;
		boolean success = true;
		
		// Convierto el valor en  int si es posible
		try {
			valor_num = Integer.parseInt(valor);
		} catch (Exception e){
			success = false;
		}
		
		if(success && valor_num <= 10) {
			// Seteo el valor que corresponda
				return valor_num;
		} 
		else if ( success && valor_num > 10) {
			throw new RuntimeException("El valor es numerico pero no corresponde a una carta de Poker.");
		}
		else {
			// Si el valor no es int, chequeo
			if (this.cartas_especiales.contains(valor)) {
				return this.obtenerValorCartaEspecial(valor);
			} else {
				throw new RuntimeException("El valor no es numerico ni coincide con alguna carta de Poker.");		
			}
		} 
	}
	
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
		return this.valor > carta.valor;
	}



}
