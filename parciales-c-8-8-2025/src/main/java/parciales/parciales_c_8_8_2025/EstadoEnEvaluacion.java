package parciales.parciales_c_8_8_2025;

public class EstadoEnEvaluacion extends Estado {

	@Override
	public void aprobar(Proyecto proyecto) {
		proyecto.setEstado(new EstadoConfirmado());
	}
	
	@Override
	public void setMargenDeGanancia(Proyecto proyecto, Double margenDeGanancia) {
		if (margenDeGanancia >= 11 && margenDeGanancia <= 15) {
			proyecto.doSetMargenDeGanancia(margenDeGanancia);
		}
	}

}
