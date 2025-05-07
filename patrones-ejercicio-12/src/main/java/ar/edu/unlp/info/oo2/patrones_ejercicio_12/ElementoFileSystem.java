package ar.edu.unlp.info.oo2.patrones_ejercicio_12;

import java.time.LocalDate;
import java.util.List;

public abstract class ElementoFileSystem {

	protected String nombre;
	protected LocalDate fechaDeCreacion;
	
	public abstract Integer tamano();
	public abstract List<String> listadoDeContenido(String path);
	public abstract String getPath(String padre);
	public abstract ElementoFileSystem buscar(String nombre);
	public abstract List<ElementoFileSystem> buscarTodos(String nombre);
	
}
