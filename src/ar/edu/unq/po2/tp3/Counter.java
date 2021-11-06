package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Counter {
	public ArrayList<Integer> list;
	
	public Counter() {
		//this.list = new ArrayList<Integer>(Arrays.asList(1,2,3,5,6,7,8,9,10,20,30,40,50,60,70,33,994));
		this.list = new ArrayList<Integer>(Arrays.asList(1,2,3,5,6,7,8,9,10,20,30,40,50,60,70,33,994));

	}
	
	public Integer cantidadDePares() {
		ArrayList<Integer> pares = new ArrayList<Integer>();
		list.stream().filter(n -> n % 2 == 0).forEach(n -> pares.add(n)); //.forEach(System.out::println);
		return pares.size();
	}
	
	public Integer cantidadDeImpares() {
		ArrayList<Integer> impares = new ArrayList<Integer>();
		list.stream().filter(n -> n % 2 != 0).forEach(n -> impares.add(n)); //.forEach(System.out::println);
		return impares.size();
	}
	
	public Integer cantidadDeMultiplosDe(int number) {
		int a = (int) list.stream().filter(n -> n % number == 0).count();
		System.out.println(a);
		
		return a;
	}
}
