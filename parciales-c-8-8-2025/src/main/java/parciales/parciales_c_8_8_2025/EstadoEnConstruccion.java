package parciales.parciales_c_8_8_2025;

public class EstadoEnConstruccion extends Estado {

	@Override
	public void aprobar(Proyecto proyecto) {
		if (proyecto.calcularPrecio() > 0) {
			proyecto.setEstado(new EstadoEnEvaluacion());
		} else {
			throw new RuntimeException("Este es el mensaje de error");
		}
	}
	
	@Override
	public void setMargenDeGanancia(Proyecto proyecto, Double margenDeGanancia) {
		if (margenDeGanancia >= 8 && margenDeGanancia <= 10) {
			proyecto.doSetMargenDeGanancia(margenDeGanancia);
		}
	}
	
}
