package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean preciosCiudados, double descuento) {
		// TODO Auto-generated constructor stub
		super(nombre,precio,preciosCiudados);	
		this.descuento = descuento;
		
	}
	
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * descuento;
		//eturn this.getPrecio() * descuento;
	}
}
