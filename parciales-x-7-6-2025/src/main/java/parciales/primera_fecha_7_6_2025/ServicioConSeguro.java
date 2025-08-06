package parciales.primera_fecha_7_6_2025;

public class ServicioConSeguro extends Servicio {

	public ServicioConSeguro(IPaquete paquete) {
		// Como defini un constructor en Servicio, debo hacerlo en la subclase tambien
		super(paquete);
	}

	@Override
	public String getDescripcion() {
		return super.getDescripcion() + " con seguro";
	}

	@Override
	public Double getCostoEnvio() {
		return super.getCostoEnvio() * 0.2;
	}

}
