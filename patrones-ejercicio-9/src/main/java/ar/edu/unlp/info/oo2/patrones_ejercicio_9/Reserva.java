package ar.edu.unlp.info.oo2.patrones_ejercicio_9;

import java.sql.Date;

public class Reserva {

	private Integer cantidadDias;
	private Date fecha;
	private Usuario conductor;
	private AutoEnAlquiler autoEnAlquiler;
	
	public Double montoAPagar() {
		return cantidadDias * autoEnAlquiler.getPrecioPorDia();
	}
	
	public Double montoAReembolsar(Date fechaTentativa) {
		return autoEnAlquiler.montoAReembolsar(this, fechaTentativa);
	}
	
	public Date getFecha() {
		return this.fecha;
	}
	
}
