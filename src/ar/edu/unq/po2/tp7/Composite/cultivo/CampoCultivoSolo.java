package ar.edu.unq.po2.tp7.Composite.cultivo;

public class CampoCultivoSolo implements ICampoCultivo {
	
private double gananciaAnual;
	
	 public CampoCultivoSolo(double ganancia) {
		// TODO Auto-generated constructor stub
		this.gananciaAnual = ganancia;
	}
	@Override
	public double gananciaAnual() {
		// TODO Auto-generated method stub
		return this.gananciaAnual;
	}

}
