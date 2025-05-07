package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class CalcularDescuentoPersonaJuridicaStrategy implements CalcularDescuentoStrategy {
  public double calcularDescuento(double montoLlamada) {
    return montoLlamada * 0.15;
  }

}
