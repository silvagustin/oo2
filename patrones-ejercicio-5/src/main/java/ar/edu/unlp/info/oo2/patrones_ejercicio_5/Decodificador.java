package ar.edu.unlp.info.oo2.patrones_ejercicio_5;

import java.util.List;

public class Decodificador {
	
	private List<Pelicula> peliculasDisponibles;
	private List<Pelicula> peliculasReproducidas;
	private EstrategiaSugerencia estrategiaSugerencia;
	
	public void setEstrategiaSugerencia(EstrategiaSugerencia estrategiaSugerencia) {
		this.estrategiaSugerencia = estrategiaSugerencia;
	}
	
	public List<Pelicula> sugerir() {
		estrategiaSugerencia.sugerir();
	}
	
}
