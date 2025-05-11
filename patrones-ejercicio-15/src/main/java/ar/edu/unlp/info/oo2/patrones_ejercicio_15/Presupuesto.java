package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

import java.util.Date;

public class Presupuesto {

	private String nombre;
	private Date fechaDeCreacion;
	private PC pc;
	
	public Presupuesto(String nombre, Date fechaDeCreacion, PC pc) {
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
		this.pc = pc;
	}
	
}
