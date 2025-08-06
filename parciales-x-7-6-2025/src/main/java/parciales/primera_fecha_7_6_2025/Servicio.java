package parciales.primera_fecha_7_6_2025;

public abstract class Servicio implements IPaquete {

	private IPaquete paquete;
	
	public Servicio(IPaquete paquete) {
		this.paquete = paquete;
	}
	
	@Override
	public String getDescripcion() {
		return this.paquete.getDescripcion();
	}
	
	@Override
	public Double getCostoEnvio() {
		return this.paquete.getCostoEnvio();
	}
	
	@Override
	public String getDestinatario() {
		return this.paquete.getDestinatario();
	}

	@Override
	public String getDireccionDestino() {
		return this.paquete.getDireccionDestino();
	}

	@Override
	public Double getValorDeclarado() {
		return this.paquete.getValorDeclarado();
	}

}
