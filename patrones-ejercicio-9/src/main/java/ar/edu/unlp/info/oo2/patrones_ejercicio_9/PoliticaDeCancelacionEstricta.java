package ar.edu.unlp.info.oo2.patrones_ejercicio_9;

import java.sql.Date;

public class PoliticaDeCancelacionEstricta implements PoliticaDeCancelacion {

	@Override
	public Double montoAReembolsar(Reserva reserva, Date fechaTentativa) {
		return 0.0;
	}

}
