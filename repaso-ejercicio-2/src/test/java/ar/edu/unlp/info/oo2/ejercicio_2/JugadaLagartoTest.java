package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JugadaLagartoTest {
	
	Jugada piedra = new JugadaPiedra();
	Jugada papel = new JugadaPapel();
	Jugada tijera = new JugadaTijera();
	Jugada lagarto = new JugadaLagarto();
	Jugada spock = new JugadaSpock();
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals(lagarto.jugarContra(piedra), "piedra");
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals(lagarto.jugarContra(papel), "lagarto");
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals(lagarto.jugarContra(tijera), "tijera");
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals(lagarto.jugarContra(lagarto), "empate");
	}
	
	@Test
	public void testJugarContraSpock() {
		assertEquals(lagarto.jugarContra(spock), "spock");
	}
	
}
