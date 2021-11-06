package ar.edu.unq.po2.tp5.sysBancario;

import java.util.ArrayList;

public class Banco {
	private String nombre;
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudDeCredito> solicitudes;
	
	public Banco(String nombre) {
		this.nombre = nombre;
	}
	
	public void registrarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void registrarSolicitud(SolicitudDeCredito solicitud) {
		this.solicitudes.add(solicitud);
	}
	
	public void evaluarSolicitudDeCredito() {
		
	}
	
	public void otorgarCredito() {
		
	}
	
	public double calcularMontoTotalDeCredito() {
		return 2;
	}
}
