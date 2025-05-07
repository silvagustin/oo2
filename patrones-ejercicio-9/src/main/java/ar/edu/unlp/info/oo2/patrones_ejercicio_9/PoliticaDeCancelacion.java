package ar.edu.unlp.info.oo2.patrones_ejercicio_9;

import java.sql.Date;

public interface PoliticaDeCancelacion {

	public Double montoAReembolsar(Reserva reserva, Date fechaTentativa);
	
}
