package ar.edu.unq.po2.tp7.Observer.EncuentrosDeportivos;

public interface IObserver {
	public void recibirNotificacion(ResultadoPartido context);
	public boolean criterio();
}
