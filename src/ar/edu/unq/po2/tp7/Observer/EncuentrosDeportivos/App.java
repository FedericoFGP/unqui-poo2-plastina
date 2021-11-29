package ar.edu.unq.po2.tp7.Observer.EncuentrosDeportivos;

import java.util.ArrayList;

public class App implements IObserver{
	
	private ArrayList<IDeporte> deportes;
	private ArrayList<String> contrincantes;

	public ArrayList<IDeporte> getDeportes() {
		return deportes;
	}

	public void setDeportes(ArrayList<IDeporte> deportes) {
		this.deportes = deportes;
	}

	public ArrayList<String> getContrincantes() {
		return contrincantes;
	}

	public void setContrincantes(ArrayList<String> contrincantes) {
		this.contrincantes = contrincantes;
	}

	@Override
	public void recibirNotificacion(ResultadoPartido context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean criterio() {
		// TODO Auto-generated method stub
		return false;
	}

}
