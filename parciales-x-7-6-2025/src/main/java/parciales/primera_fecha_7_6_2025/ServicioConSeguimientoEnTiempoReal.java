package parciales.primera_fecha_7_6_2025;

public class ServicioConSeguimientoEnTiempoReal extends Servicio {
	
	public ServicioConSeguimientoEnTiempoReal(IPaquete paquete) {
		super(paquete);
	}
	
	@Override
	public Double getCostoEnvio() {
		return super.getCostoEnvio() + 2000.0;
	}
	
}
