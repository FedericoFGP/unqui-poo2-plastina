package ar.edu.unq.po2.tp5;

public class FacturaImpuesto extends Factura{
	private double tasa;
	
	public FacturaImpuesto() {
		
	}
	
	@Override
	public double montoAPagar() {
		return this.tasa;
	}

}
