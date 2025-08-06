package parciales.primera_fecha_7_6_2025;

public class ServicioConManipulacionFragil extends Servicio {
	
	public ServicioConManipulacionFragil(IPaquete paquete) {
		super(paquete);
	}
	
	@Override
	public String getDescripcion() {
		return super.getDescripcion() + "fragil";
	}
	
}
