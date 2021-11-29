package ar.edu.unq.po2.tp7.Observer.EncuentrosDeportivos;

import java.util.ArrayList;

public class ResultadoPartido {
	private String resultado;
	private ArrayList <String> contrincantes;
	private IDeporte deporte;
	
	public ResultadoPartido(String resultado, ArrayList<String> contrincantes, IDeporte deporte) {
		super();
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public ArrayList<String> getContrincantes() {
		return contrincantes;
	}

	public void setContrincantes(ArrayList<String> contrincantes) {
		this.contrincantes = contrincantes;
	}

	public IDeporte getDeporte() {
		return deporte;
	}

	public void setDeporte(IDeporte deporte) {
		this.deporte = deporte;
	}
}
