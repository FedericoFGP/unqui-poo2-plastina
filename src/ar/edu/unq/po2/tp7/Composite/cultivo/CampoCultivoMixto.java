package ar.edu.unq.po2.tp7.Composite.cultivo;

import java.util.ArrayList;

public class CampoCultivoMixto implements ICampoCultivo{
	private ArrayList<ICampoCultivo> parcelas;
	
	public CampoCultivoMixto() {
		// TODO Auto-generated constructor stub
		super();
		this.parcelas = new ArrayList<ICampoCultivo>();
	}
	
	public ArrayList<ICampoCultivo> getParcelas() {
		return this.parcelas;
	}
	
	public void registrarParcela(ICampoCultivo parcela) {
		this.parcelas.add(parcela);
	}
	
	public double gananciaAnual() {
		return this.parcelas.stream().mapToDouble(ICampoCultivo::gananciaAnual).sum();
	}

}
