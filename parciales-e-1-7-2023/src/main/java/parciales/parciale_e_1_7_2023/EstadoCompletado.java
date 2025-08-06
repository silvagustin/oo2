package parciales.parciale_e_1_7_2023;

public class EstadoCompletado extends Estado {

	@Override
	public long tiempoUtilizado(TareaSimple tarea) {
		return tarea.getCompletadoEn() - tarea.getIniciadoEn();
	}
	
}
