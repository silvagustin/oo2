package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class DescuentoPersonaJuridicaStrategy implements DescuentoStrategy {
  public double calcularDescuento(double montoLlamada) {
    return montoLlamada * 0.15;
  }

}
