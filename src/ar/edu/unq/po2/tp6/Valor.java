package ar.edu.unq.po2.tp6;

public enum Valor {
	A(14),K(13),J(12),Q(11),DIEZ(10),NUEVE(9),OCHO(8),SIETE(7),SEIS(6),CINCO(5),CUATRO(4),TRES(3),DOS(2);
	
	private int equivalente;
	
	Valor(int i) {
		this.equivalente = i;
	}
	
	public int getValor() {
		return this.equivalente;
	}
	public boolean esMayor(Valor val) {
		return this.equivalente > val.equivalente;
	}
}
