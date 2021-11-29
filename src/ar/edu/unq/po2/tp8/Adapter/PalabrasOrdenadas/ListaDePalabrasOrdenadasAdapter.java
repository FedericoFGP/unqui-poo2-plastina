package ar.edu.unq.po2.tp8.Adapter.PalabrasOrdenadas;

import javax.swing.DefaultListModel;

public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String>{
	
	ListaDePalabrasOrdenadas palabrasOrdenadas;
	
	public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas ordenadorAAdaptar) {
		super();
		this.palabrasOrdenadas = ordenadorAAdaptar;
	}

	
	@Override 
	public void addElement(String palabra) {
		super.addElement(palabra);
		this.palabrasOrdenadas.agregarPalabra(palabra);
		//this.removeAllElements();
		//this.addAll(palabrasOrdenadas.getAll());
	}
}
