package ar.edu.unlp.info.oo2.patrones_ejercicio_9;

import java.sql.Date;

public class AutoEnAlquiler {

	private Double precioPorDia;
	private Integer cantidadPlazas;
	private String marca;
	private PoliticaDeCancelacion politicaDeCancelacion;
	
	public Double montoAReembolsar(Reserva reserva, Date fechaTentativa) {
		return politicaDeCancelacion.montoAReembolsar(reserva, fechaTentativa);
	}
	
}
