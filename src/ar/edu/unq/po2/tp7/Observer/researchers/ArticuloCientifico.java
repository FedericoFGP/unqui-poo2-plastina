package ar.edu.unq.po2.tp7.Observer.researchers;

import java.util.ArrayList;

public class ArticuloCientifico {
	private String titulo;
	private String autores;
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public ArrayList<String> getPalabrasClaves() {
		return palabrasClaves;
	}

	public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}

	public ArticuloCientifico(String titulo, String autores, String filial, String tipo, String lugar,
			ArrayList<String> palabrasClaves) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.filial = filial;
		this.tipo = tipo;
		this.lugar = lugar;
		this.palabrasClaves = palabrasClaves;
	}

	private String filial;
	private String tipo;
	private String lugar;
	private ArrayList<String> palabrasClaves;
	
	public ArticuloCientifico() {
		
	}
	
}
