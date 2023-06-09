package p1.ejercicio5;

import java.time.LocalDate;

public class Archivo extends FileSystem {
	
	/**
	 *	Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano 
	 *	y en la fecha <fecha>.
	 */
	public Archivo (String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	
}
