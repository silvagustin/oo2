package parciales.parciale_e_1_7_2023;

public abstract class Tarea {

	protected String nombre;
	protected String descripcion;
	
	protected abstract Integer getDuracionEstimada();
	protected abstract long tiempoUtilizado();
	// protected abstract long calcularAvanceDeUnaTarea();
	public abstract void iniciar();
	public abstract void completar();
	
}


// Tareas:
// Simples y complejas

// Las complejas tienen otras tareas (me suena a composite)


// atributos: nombre y duracionEstimada (int > 0), fechaDeInicio, fechaDeFin, descripcion

// No se puede completar una tarea que no fue iniciada! Ni una que YA fue completada.
// Tampooc se puede iniciar una tarea que se encuentre completada


// COmposite y State