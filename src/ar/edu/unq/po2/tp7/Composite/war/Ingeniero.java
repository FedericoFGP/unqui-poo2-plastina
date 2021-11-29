package ar.edu.unq.po2.tp7.Composite.war;

import java.util.ArrayList;

import java.awt.Point;


public class Ingeniero extends Personaje {
	private int cantLajas;
	private ArrayList<ICamino> camino;
	
	public Ingeniero() {
		//	super()
		camino = new ArrayList<ICamino>();
		this.iniciarUbicacion();
		
	}
	
	@Override
	public void caminarAPosicion(Point punto) {
		//this.construirCamino(punto);
		//this.ubicacion = punto;
		
		while (this.ubicacion != punto) {
			this.ubicacion = punto;
			this.construirCamino(punto);
			
		}
	}
	
	public ArrayList<ICamino> getCaminoConstruido(){
		return this.camino;
	}
	
	public boolean tieneLajas() {
		return this.cantLajas >= 1;
	}
	
	public void colocarLaja() {
		ICamino laja = new ParteDeCamino();
		this.getCaminoConstruido().add(laja);
		this.cantLajas -= 1;
	}
	
	public void construirCamino(Point destino) {
			System.out.println(this.cantLajas);
			if(this.tieneLajas()) {
				this.colocarLaja();
				System.out.println("aca");
			} 
	}
	
	public void agregarLajas(int cant) {
		this.cantLajas += cant;
	}

}
