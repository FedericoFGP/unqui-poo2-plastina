package ar.edu.unq.po2.tp4;
import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		return productos.stream().mapToDouble( producto -> producto.getPrecio()).sum();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	

}
