package ar.edu.unq.po2.tp5.sysBancario;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {
	private IPropiedad propiedadEnGarantia;
	
	public SolicitudDeCreditoHipotecario(Cliente solicitante, double monto, int plazo, IPropiedad propiedadEnGarantia) {
		super(solicitante, monto, plazo);
		// TODO Auto-generated constructor stub
		this.propiedadEnGarantia = propiedadEnGarantia;
	}

	@Override
	public boolean requisito() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
