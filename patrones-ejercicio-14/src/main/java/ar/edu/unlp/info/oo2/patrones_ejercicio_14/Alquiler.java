package ar.edu.unlp.info.oo2.patrones_ejercicio_14;

import java.time.LocalDate;

public class Alquiler extends Prenda {
	
	private LocalDate comienzoDeContrato;
	private LocalDate finDeContrato;
	private Double costoMensual;

	@Override
	protected Double valor() {
		// Implementar calculo de meses entre dos fechas
		
		return null;
	}

	@Override
	protected Double coeficienteDeLiquidez() {
		return 0.9;
	}

}
