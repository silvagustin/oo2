package ar.edu.unlp.info.oo2.patrones_ejercicio_9;

import java.sql.Date;

public class PoliticaDeCancelacionFlexible implements PoliticaDeCancelacion {

	@Override
	public Double montoAReembolsar(Reserva reserva, Date fechaTentativa) {
		if (fechaTentativa.before(reserva.getFecha())) {
			return reserva.montoAPagar();
		} else {
			return 0.0;
		}
	}

}
