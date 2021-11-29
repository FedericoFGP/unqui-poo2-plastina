package ar.edu.unq.po2.tp9.stateystrategy.crypto;

public class Encriptador {
	private String codigoEncriptado;
	
	public void encriptar(String codigo, IMecanismoEncriptado metodo ) {
		String codEncriptado = metodo.encriptar(codigo);
		this.setCodigoEncriptado(codEncriptado);
	}
	
	public void desencriptar(String codigo, IMecanismoEncriptado metodo) {
		String codDesencriptado = metodo.desencriptar(codigo);
		this.setCodigoEncriptado(codDesencriptado);
	}

	
	public String getCodigoEncriptado() {
		return this.codigoEncriptado;
	}
	
	private void setCodigoEncriptado(String codigo) {
		this.codigoEncriptado = codigo;
	}
}
