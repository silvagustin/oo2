package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class DescuentoPersonasOtrasStrategy implements DescuentoStrategy {
	  public double calcularDescuento(double montoLlamada) {
		  return montoLlamada * 0;
	  }
}
