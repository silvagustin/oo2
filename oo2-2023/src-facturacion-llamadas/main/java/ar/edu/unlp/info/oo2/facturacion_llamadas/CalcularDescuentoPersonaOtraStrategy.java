package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class CalcularDescuentoPersonaOtraStrategy implements CalcularDescuentoStrategy {
	  public double calcularDescuento(double montoLlamada) {
		  return montoLlamada * 0;
	  }
}
