package parciales.primera_fecha_7_6_2025;

public class ServicioConEntregaExpres extends Servicio {

	public ServicioConEntregaExpres(IPaquete paquete) {
		super(paquete);
	}
	
	@Override
	public String getDescripcion() {
		return super.getDescripcion() + "entrega express";
	}
	
	@Override
	public Double getCostoEnvio() {
		return super.getCostoEnvio() + super.getValorDeclarado() * 0.5;
	}
	
}
