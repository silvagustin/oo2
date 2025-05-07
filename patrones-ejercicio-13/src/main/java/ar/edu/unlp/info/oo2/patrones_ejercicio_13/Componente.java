package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

public class Componente {

	private String nombre;
	private Integer precio;
	
	public Componente(String nombre, Integer precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Integer getPrecio() {
		return precio;
	}
	
	public String toString() {
		return nombre + " ($" + precio + ")"; 
	}
	
}
