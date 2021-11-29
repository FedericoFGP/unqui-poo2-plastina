package ar.edu.unq.po2.tp9.stateystrategy.musica;

public interface IEstadoRep {
	public void reproducirCancion(Cancion cancion, Reproductor rep);
	public void pausa(Cancion cancion, Reproductor rep);
	public void parar(Cancion cancion, Reproductor rep);
	
	
}
