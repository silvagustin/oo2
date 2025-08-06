package parciales.parciale_e_1_7_2023;

import java.util.List;

public class TareaCompleja extends Tarea {
	
	private List<Tarea> tareas;
	
	@Override
	protected Integer getDuracionEstimada() {
		return tareas.stream()
					 .mapToInt(tarea -> tarea.getDuracionEstimada())
					 .sum();
	}

	@Override
	protected long tiempoUtilizado() {
		return tareas.stream()
				 .mapToLong(tarea -> tarea.tiempoUtilizado())
				 .sum();
	}
	
	@Override
	public void iniciar() {
		for(Tarea tarea: tareas) {
			tarea.iniciar();
		}
	}
	
	@Override
	public void completar() {
		for(Tarea tarea: tareas) {
			tarea.completar();
		}
	}
	
}
