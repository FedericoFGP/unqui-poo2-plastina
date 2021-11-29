package ar.edu.unq.po2.tp8.Sueldos;

public class EmpleadoPasante extends Empleado{
	private int horasTrabajadas;
	private int valorHora;
	
	public EmpleadoPasante(int horas) {
		// TODO Auto-generated constructor stub
		this.horasTrabajadas = horas;
		this.valorHora = 40;
	}
	
	@Override
	public double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.cargas();
	}

	@Override
	public double cargas() {
		// TODO Auto-generated method stub
		return this.horasTrabajadas * this.valorHora;
	}

}
