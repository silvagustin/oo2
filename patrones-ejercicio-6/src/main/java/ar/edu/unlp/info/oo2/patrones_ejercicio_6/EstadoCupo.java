package ar.edu.unlp.info.oo2.patrones_ejercicio_6;

public abstract class EstadoCupo {
	
	public abstract String obtenerInformacion(Excursion excursion);
	public abstract void inscribir(Excursion excursion, Usuario usuario);
	
}
