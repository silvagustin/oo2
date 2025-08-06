package parciales.primera_fecha_7_6_2025;

public class Paquete implements IPaquete {

	private String descripcion;
	private String destinatario;
	private String direccionDestino;
	private Double valorDeclarado;

	@Override
	public String getDescripcion() {
		return this.descripcion;
	}

	@Override
	public String getDestinatario() {
		return this.destinatario;
	}

	@Override
	public String getDireccionDestino() {
		return this.direccionDestino;
	}

	@Override
	public Double getValorDeclarado() {
		return this.valorDeclarado;
	}

	@Override
	public Double getCostoEnvio() {
		return this.getValorDeclarado() * 0.05;
	}
	
}
