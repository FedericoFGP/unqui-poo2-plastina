package ar.edu.unq.po2.tp5.sysBancario;

public class SolicitudeDeCreditoPersonal extends SolicitudDeCredito {

	public SolicitudeDeCreditoPersonal(Cliente solicitante, double monto, int plazo) {
		super(solicitante, monto, plazo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean requisito() {
		// TODO Auto-generated method stub
		return false;
	}

}
