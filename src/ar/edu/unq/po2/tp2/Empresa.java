package ar.edu.unq.po2.tp2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Empresa {
	
	String nombre;
	Integer cuit;
	ArrayList<Empleado> empleados;
	Map<Empleado,ReciboDeHaberes> recibos;
	
	public Empresa(String nombre, Integer cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();
		this.recibos = new HashMap<Empleado, ReciboDeHaberes>();
	}
	
	public void contratar(Empleado e) {
		empleados.add(e);
	}
	
	public Double montoTotalDeSueldosBrutos(ArrayList<Empleado> empleados) {
		
		Double sueldos = empleados.stream().mapToDouble(Empleado::sueldoBruto).sum();
		return sueldos;
	}
	
	public Double montoTotalDeSueldosNetos(ArrayList<Empleado> empleados) {
		
		Double sueldos = empleados.stream().mapToDouble(Empleado::sueldoNeto).sum();
		return sueldos;
	}
	
	public Double montoTotalDeRetenciones(ArrayList<Empleado> empleados) {
		
		Double sueldos = empleados.stream().mapToDouble(Empleado::retenciones).sum();
		return sueldos;
	}
	
	
	public void generarRecibos(ArrayList<Empleado> empleados) {
		empleados.stream().forEach( e -> {
			ReciboDeHaberes recibo = this.crearRecibo(e);
			agregarRecibo(e, recibo);
		} );
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public Map<Empleado, ReciboDeHaberes> getRecibos() {
		return recibos;
	}

	private void agregarRecibo( Empleado empleado, ReciboDeHaberes recibo) {
		this.recibos.put(empleado,recibo);
	}
	
	private ReciboDeHaberes crearRecibo(Empleado e) {
		ReciboDeHaberes recibo = new ReciboDeHaberes(
				e.getNombre(),
				e.getDireccion(),
				e.sueldoBruto(),
				e.sueldoNeto());
		e.desgloce(recibo);
		return recibo;
	}
}
