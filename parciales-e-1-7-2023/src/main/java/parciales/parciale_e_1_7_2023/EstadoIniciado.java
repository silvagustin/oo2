package parciales.parciale_e_1_7_2023;

public class EstadoIniciado extends Estado {

	@Override
	public void completar(TareaSimple tarea) {
		tarea.setEstado(new EstadoCompletado());
		tarea.setCompletadoEn(System.currentTimeMillis());
	}
	
}
