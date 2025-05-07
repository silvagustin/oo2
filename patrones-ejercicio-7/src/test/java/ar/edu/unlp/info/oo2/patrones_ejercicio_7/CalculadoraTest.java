package ar.edu.unlp.info.oo2.patrones_ejercicio_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
	
	Calculadora calculadora;

	@BeforeEach
	void setUp() throws Exception {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testSuma() {
		calculadora.setValor(5.0); 	// Establece el valor inicial
		calculadora.mas(); 			// Prepara para sumar
		calculadora.setValor(3.0); 	// Suma 3 al valor acumulado

		assertEquals(calculadora.getResultado(), "8.0");
	}
	
	@Test
	public void testPor() {
		// calculadora.por();
		// calculadora.setValor(2.0);
	}
	
}
