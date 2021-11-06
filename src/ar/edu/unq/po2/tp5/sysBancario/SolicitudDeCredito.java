package ar.edu.unq.po2.tp5.sysBancario;

public abstract class SolicitudDeCredito {
	private boolean aceptada;
	private Cliente cliente;
	private double monto;
	private int plazo;
	
	public SolicitudDeCredito(Cliente solicitante, double monto, int plazo ) {
		this.aceptada = false;
		this.cliente = solicitante;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public double cuotaMensual() {
		return monto / plazo;
	}
	
	public abstract boolean requisito();
}
