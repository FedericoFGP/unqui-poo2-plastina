package ar.edu.unq.po2.tp7.Observer.EncuentrosDeportivos;

import java.util.ArrayList;

public class Sys implements ISubject {
	
	private ArrayList<IObserver> subscriptores;
	private ArrayList<ResultadoPartido> resultados;
	
	public Sys(){};
	
	@Override
	public void subscribir(IObserver obs) {
		// TODO Auto-generated method stub
		this.subscriptores.add(obs);
		
	}

	@Override
	public void desubscribir(IObserver obs) {
		// TODO Auto-generated method stub
		this.subscriptores.remove(obs);
		
	}
	
	public void cargarResultado(ResultadoPartido res) {
		this.resultados.add(res);
	}

}
