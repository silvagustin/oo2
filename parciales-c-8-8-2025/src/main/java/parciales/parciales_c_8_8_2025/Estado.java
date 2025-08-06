package parciales.parciales_c_8_8_2025;

/*
 * Q: Está bien que la clase "Estado" sea abstracta cuando no tiene ningún método abstracto? 
 * Simplemente lo hice abstracto para respetar la estructura del patrón State.
 * 
 * A: Sí, está perfectamente bien que la clase Estado sea abstracta aunque no tenga métodos abstractos.
 * De hecho, eso es una práctica común y válida, especialmente en patrones como 
 * State, Strategy, o Template Method.
 * 
 * Esto evita la instanciacion directa de Estado (evita new Estado()).
 * 
 */

public abstract class Estado {

	public void aprobar(Proyecto proyecto) {}
	
	public void cancelar(Proyecto proyecto) {
		proyecto.setEstado(new EstadoCancelado());
		proyecto.actualizarObjetivoACancelado();
	}
	
	public void setMargenDeGanancia(Proyecto proyecto, Double margenDeGanancia) {}
	
}
