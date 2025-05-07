package ar.edu.unlp.info.oo2.patrones_ejercicio_9;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

public class PoliticaDeCancelacionModerada implements PoliticaDeCancelacion {

	@Override
	public Double montoAReembolsar(Reserva reserva, Date fechaTentativa) {
		if (fechaTentativa.before(reserva.getFecha())) {
			if (calcularDiferenciaDeDias(fechaTentativa, reserva.getFecha()) <= 2) {
				return reserva.montoAPagar() / 2;
			} else {
				return reserva.montoAPagar();
			}
		} else {
			return 0.0;
		}
	}
	
	private long calcularDiferenciaDeDias(Date d1, Date d2) {
		long diff = d2.getTime() - d1.getTime();
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

}
