package ar.edu.unq.po2.tp5.sysBancario;

public class Propiedad implements IPropiedad{
	private String direccion;
	
	public Propiedad(String direccion) {
		this.direccion = direccion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}

	@Override
	public IPropiedad getPropiedad() {
		// TODO Auto-generated method stub
		return this;
	}
}
