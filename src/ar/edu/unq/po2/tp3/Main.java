package ar.edu.unq.po2.tp3;
import java.time.LocalDate;

import ar.edu.unq.po2.tp3.Expression;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Expression a = new Expression();
		
		//a.eje4();
		
		
		Multioperador b = new Multioperador();
		
		System.out.println(b.resta());
		System.out.println(b.suma());
		System.out.println(b.multiplicacion());
		
		//7 
		//1) Aparecen de la forma ../model/gui y ../model/stack. Es decir, ambos sub paquetes estan dentro de Model.
		//2)Mantienen una misma estructura y jerarquia.
		
		LocalDate n = LocalDate.now();
		LocalDate nn = LocalDate.now().minusYears(20);
		
		Persona persona = new Persona("Juan Carlos","Ronaldo", n);
		Persona persona1 = new Persona("Carlos","Vasquez", nn);
		Persona persona2 = new Persona("Pepe","Alcidez", nn);
		Persona persona3 = new Persona("Faustino","Fernandez", nn);
		Persona persona4 = new Persona("Jose","Perez", nn);
		System.out.println(persona.getEdad());
		System.out.println(persona.getNombre());
		System.out.println(persona.getFechaNac());
		System.out.println(persona1.menorQue(persona));
		
		EquipoDeTrabajo omega = new EquipoDeTrabajo("Omega");
		
		omega.ingresarIntegrante(persona);
		omega.ingresarIntegrante(persona1);
		omega.ingresarIntegrante(persona2);
		omega.ingresarIntegrante(persona3);
		omega.ingresarIntegrante(persona4);
		
		omega.promedioDeEdad();
		System.out.println(persona4.getEdad());
	
	}

}
