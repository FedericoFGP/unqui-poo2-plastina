package ar.edu.unq.po2.tp9.stateystrategy.juegos;

public class MaquinaDeJuego {
	private int fichas;
	private IPantalla pantalla;
	private IEstado estado;
	
	public MaquinaDeJuego(IPantalla pantalla) {
		this.pantalla = pantalla;
	}
	
	public void ingresarFichas(int fichasAdicionales) {
		this.fichas += fichasAdicionales;
	}

	public int getFichas() {
		return fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public IPantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(IPantalla pantalla) {
		this.pantalla = pantalla;
	}

	public IEstado getEstado() {
		return estado;
	}

	public void setEstado(IEstado estado) {
		this.estado = estado;
	}
	
	public void configurarParticipantes(int participantes) {
		this.estado.configurarParticipantes(this, participantes);
	}
	
	public void mostrarPantalla(String mensaje) {
		this.pantalla.mostrarEnPantalla(mensaje);
	}
	
}
