package ar.edu.unlp.info.oo2.ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {
  Integer cantHorasTrabajadas = 40;
  Integer cantHijos = 2;

  Empleado empleadoTemporario;
  Empleado empleadoTemporarioCasado;

  @BeforeEach
  void setUp() {
    empleadoTemporario = new EmpleadoTemporario(false, this.cantHorasTrabajadas, this.cantHijos);
    empleadoTemporarioCasado = new EmpleadoTemporario(true, this.cantHorasTrabajadas, this.cantHijos);
  }

  @Test
  public void testCalcularBasico() {
    Double resultadoEsperado = 20000.0 + this.cantHorasTrabajadas * 300.0;
    assertEquals(empleadoTemporario.calcularBasico(), resultadoEsperado);
  }

  @Test
  public void testCalcularAdicional() {
    // Empleado soltero
    Double resultadoEsperado = 2000.0 * this.cantHijos;
    assertEquals(empleadoTemporario.calcularAdicional(), resultadoEsperado);

    // Empleado casado
    resultadoEsperado = 5000.0 + 2000.0 * this.cantHijos;
    assertEquals(empleadoTemporarioCasado.calcularAdicional(), resultadoEsperado);
  }

  @Test
  public void testCalcularDescuento() {
    Double resultadoEsperado = empleadoTemporario.calcularBasico() * 0.13 + empleadoTemporario.calcularAdicional() * 0.05;
    assertEquals(empleadoTemporario.calcularDescuento(), resultadoEsperado);
  }

  @Test
  public void testCalcularSueldo() {
    Double resultadoEsperado = empleadoTemporario.calcularBasico() + empleadoTemporario.calcularAdicional() - empleadoTemporario.calcularDescuento();
    assertEquals(empleadoTemporario.calcularSueldo(), resultadoEsperado);
  }

}
