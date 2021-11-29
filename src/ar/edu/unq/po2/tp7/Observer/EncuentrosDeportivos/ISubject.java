package ar.edu.unq.po2.tp7.Observer.EncuentrosDeportivos;

public interface ISubject {
	public void subscribir(IObserver obs);
	public void desubscribir(IObserver obs);
}
