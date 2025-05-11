package ar.edu.unlp.info.oo2.patrones_ejercicio_14;

import java.util.Calendar;

public class Automovil extends Prenda {
	
	private Integer modelo;
	private Double kilometraje;
	private Double costoCeroKM;

	@Override
	protected Double valor() {
		Double costoAntiguedad = (Calendar.YEAR - modelo) * 0.1;
		
		return costoCeroKM * costoAntiguedad;
	}

	@Override
	protected Double coeficienteDeLiquidez() {
		return 0.7;
	}

}
