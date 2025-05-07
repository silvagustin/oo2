package ar.edu.unlp.info.oo2.ejercicio_4;

public class EmpleadoPasante extends Empleado {

  private Integer cantExamenesRendidos;

  public EmpleadoPasante(Integer cantExamenesRendidos) {
    this.cantExamenesRendidos = cantExamenesRendidos;
  }

  @Override
  protected Double calcularBasico() {
    return 20000.0;
  }

  @Override
  protected Double calcularAdicional() {
    return 2000.0 * this.cantExamenesRendidos;
  }

}
