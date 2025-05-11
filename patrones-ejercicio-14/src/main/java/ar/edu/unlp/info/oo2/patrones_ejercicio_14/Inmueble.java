package ar.edu.unlp.info.oo2.patrones_ejercicio_14;

public class Inmueble extends Prenda {
	
	private String direccion;
	private Double superficie;
	private Double costoM2;

	@Override
	protected Double valor() {
		return superficie * costoM2;
	}

	@Override
	protected Double coeficienteDeLiquidez() {
		return 0.2;
	}

}
