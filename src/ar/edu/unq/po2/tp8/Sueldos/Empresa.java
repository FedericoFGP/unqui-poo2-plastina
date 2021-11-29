package ar.edu.unq.po2.tp8.Sueldos;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;
	
	public Empresa(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void contratarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public void desvincularEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
	}
	
	public void pagarSueldos() {
		this.empleados.forEach(null);
	}
}
