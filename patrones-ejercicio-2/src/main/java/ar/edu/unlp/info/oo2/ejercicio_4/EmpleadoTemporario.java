package ar.edu.unlp.info.oo2.ejercicio_4;

public class EmpleadoTemporario extends Empleado {

  private Boolean estaCasado;
  private Integer cantHorasTrabajadas;
	private Integer cantHijos;

  public EmpleadoTemporario(Boolean estaCasado, Integer cantHorasTrabajadas, Integer cantHijos) {
    this.estaCasado = estaCasado;
    this.cantHorasTrabajadas = cantHorasTrabajadas;
    this.cantHijos = cantHijos;
  }

  @Override
  protected Double calcularBasico() {
    return 20000.0 + this.cantHorasTrabajadas * 300.0;
  }

  @Override
  protected Double calcularAdicional() {
    Double adicional = 0.0;

    if (this.estaCasado == true) {
      adicional = 5000.0;
    }

    return adicional + 2000.0 * this.cantHijos;
  }

}
