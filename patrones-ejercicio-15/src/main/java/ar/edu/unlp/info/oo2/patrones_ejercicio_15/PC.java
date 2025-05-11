package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

import java.util.HashMap;
import java.util.Map;

public class PC {

	private Map<String, Componente> componentes;
	
	public PC() {
		this.componentes = new HashMap<String, Componente>();
	}
	
	public void setProcesador(Componente componente) {
		this.componentes.put("Procesador", componente);
	}
	
	public void setMemoriaRAM(Componente componente) {
		this.componentes.put("Memoria RAM", componente);
	}
	
	public void setDisco(Componente componente) {
		this.componentes.put("Disco", componente);
	}
	
	public void setTarjetaGrafica(Componente componente) {
		this.componentes.put("Tarjeta grafica", componente);
	}
	
	public void setGabinete(Componente componente) {
		this.componentes.put("Gabinete", componente);
	}
	
	public Double calcularConsumo() {
		return componentes.values()
						  .stream()
						  .mapToDouble(componente -> componente.getConsumo())
						  .sum();
	}
	
}
