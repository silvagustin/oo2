package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class CalcularMontoLlamadaNacionalStrategy implements CalcularMontoStrategy {
  public double calcularMonto(int duracion) {
    return duracion * 3 + (duracion * 3 * 0.21);
  }

}
