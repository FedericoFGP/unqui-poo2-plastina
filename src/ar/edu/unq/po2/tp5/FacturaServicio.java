package ar.edu.unq.po2.tp5;

public class FacturaServicio extends Factura {
	private double costo;
	private int cantidad;
	
	public FacturaServicio() {
		
	}


	@Override
	public double montoAPagar() {
		// TODO Auto-generated method stub
		return costo * cantidad;
	}
}
