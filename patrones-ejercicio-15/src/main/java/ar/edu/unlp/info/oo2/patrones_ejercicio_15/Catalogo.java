package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

	private List<Componente> componentes;
	
	public Catalogo() {
		this.componentes = new ArrayList<Componente>();
	}
	
	public Componente getComponente(String description) {
		return componentes.stream()
						  .filter(componente -> componente.getDescripcion().contains(description))
						  .findFirst()
						  .orElse(null);
	}
	
}
