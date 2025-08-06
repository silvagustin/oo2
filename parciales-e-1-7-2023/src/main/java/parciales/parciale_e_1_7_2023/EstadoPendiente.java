package parciales.parciale_e_1_7_2023;

public class EstadoPendiente extends Estado {

	@Override
	public void iniciar(TareaSimple tarea) {
		tarea.setEstado(new EstadoIniciado());
		tarea.setIniciadoEn(System.currentTimeMillis());
	}
	
}
