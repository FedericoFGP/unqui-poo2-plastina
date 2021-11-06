package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Multioperador {
public ArrayList<Integer> list;
	
	public Multioperador() {
		//this.list = new ArrayList<Integer>(Arrays.asList(1,2,3,5,6,7,8,9,10,20,30,40,50,60,70,33,994));
		this.list = new ArrayList<Integer>(Arrays.asList(1,2,3,5,6));

	}
	
	public int suma(){
		return list.stream().collect(Collectors.summingInt(Integer::intValue));
	}
	
	public int resta() {
		return list.stream().reduce(0 , (subtotal, el) -> subtotal - el);
	}
	
	public int multiplicacion() {
		return list.stream().reduce(1, (subtotal, el ) -> subtotal * el);
	}
}
