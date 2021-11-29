package ar.edu.unq.po2.tp9.stateystrategy.juegos;

public interface IEstado {
	public void ingresarFichas(MaquinaDeJuego maq, int cant);
	public void configurarParticipantes(MaquinaDeJuego maq, int cant);
}
