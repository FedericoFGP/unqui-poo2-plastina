package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.stream.Stream;


public class Main {
	public static void main(String[] args) {
		Date fechaNac = new Date(1950,1,1);
		Date fechaFin = new Date(2022,1,1);
		
		Empleado empleado1 = new EmpleadoPermanente("Jose Ramirez", "Calle falsa 1456" , "casado", fechaNac,  (float) 10000.00000, 3 , 5);
		Empleado empleado2 = new EmpleadoContratado("Juan Perez", "Calle falsa 789" , "casado", fechaNac,  (float) 10000.00000, fechaFin, 10);
		Empleado empleado3 = new EmpleadoTemporario("Juan Martin", "Calle falsa 098" ,"Soltero", fechaNac,  (float) 10000.00000, 3 , "Cheque");
		
	
		Empresa empresa = new Empresa("Jamones lopez", 30303030);
		
		empresa.contratar(empleado1);
		empresa.contratar(empleado2);
		empresa.contratar(empleado3);
		
		System.out.print(empleado1.edad());
		
		System.out.print(empleado1.sueldoNeto());
	
		System.out.print(empleado2.sueldoNeto());
		System.out.print(empleado3.sueldoNeto());
		
		System.out.print(empleado1.sueldoBruto());
		System.out.print(empleado2.sueldoBruto());
		System.out.print(empleado3.sueldoBruto());
		ArrayList e = empresa.getEmpleados();
		
		empresa.generarRecibos(e);
		Map<Empleado,ReciboDeHaberes>recibos = empresa.getRecibos();
		Stream.of(recibos.keySet().toArray()).forEach(System.out::println);
		Stream.of(recibos.values().toArray()).forEach(r -> {System.out.println(((ReciboDeHaberes) r).getDesgloce());} );
	}
}
