package ar.edu.unq.po2.tp7.Composite.war;

public class ParteDeCamino implements ICamino {
	private boolean hayLaja;
	
	public ParteDeCamino() {
		// TODO Auto-generated constructor stub
		this.hayLaja = false;
	}
	@Override
	public boolean hayLaja() {
		// TODO Auto-generated method stub
		return this.hayLaja;
	}

	@Override
	public void setLaja(boolean laja) {
		this.hayLaja = laja;
	}

}
