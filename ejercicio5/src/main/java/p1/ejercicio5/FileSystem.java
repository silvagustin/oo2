package p1.ejercicio5;

import java.time.LocalDate;

public abstract class FileSystem {
	
	protected String nombre;
	protected LocalDate fecha;
	protected int tamano;
	
	public abstract int tamanoTotalOcupado();
	
}
