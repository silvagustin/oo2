package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

public class Componente {

	private String nombre, descripcion;
	private Double precio, consumo;
	
	public Componente(String nombre, String descripcion, Double precio, Double consumo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.consumo = consumo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public Double getConsumo() {
		return this.consumo;
	}
	
}
