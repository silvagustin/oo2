package ar.edu.unlp.info.oo2.ejercicio_4;

public class EmpleadoPlanta extends Empleado {

  private Boolean estaCasado;
  private Integer cantAniosDeAntiguedad;
	private Integer cantHijos;

  public EmpleadoPlanta(Boolean estaCasado, Integer cantAniosDeAntiguedad, Integer cantHijos) {
    this.estaCasado = estaCasado;
    this.cantAniosDeAntiguedad = cantAniosDeAntiguedad;
    this.cantHijos = cantHijos;
  }

  @Override
  protected Double calcularBasico() {
    return 50000.0;
  }

  @Override
  protected Double calcularAdicional() {
    Double subtotal = 0.0;

    if (this.estaCasado) {
      subtotal = 5000.0;
    }

    return subtotal + 2000.0 * this.cantHijos + 2000.0 * this.cantAniosDeAntiguedad;
  }

}

