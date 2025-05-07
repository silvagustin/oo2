package ar.edu.unlp.info.oo2.ejercicio_4;

abstract class Empleado {

	public Double calcularSueldo() {
		return calcularBasico() + calcularAdicional() - calcularDescuento();
	}

	protected abstract Double calcularBasico();
	protected abstract Double calcularAdicional();

	protected Double calcularDescuento() {
    return calcularBasico() * 0.13 + calcularAdicional() * 0.05;
  }

}
