package ar.edu.unq.po2.tp5;

public abstract class Factura {
	private IAgencia agencia;
	
	public Factura() {
		
	}
	
	public abstract double  montoAPagar();
	
	public void registrar() {
		this.agencia.registrarPago(this);
	}
}
