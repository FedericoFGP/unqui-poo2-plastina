package ar.edu.unq.po2.tp9.stateystrategy.crypto;

public interface IMecanismoEncriptado {
	public String encriptar(String codigo);
	public String desencriptar(String codigo);
}
