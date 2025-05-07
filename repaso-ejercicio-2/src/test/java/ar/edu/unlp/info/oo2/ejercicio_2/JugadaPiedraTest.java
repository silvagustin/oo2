package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JugadaPiedraTest {
	
	Jugada piedra = new JugadaPiedra();
	Jugada papel = new JugadaPapel();
	Jugada tijera = new JugadaTijera();
	Jugada lagarto = new JugadaLagarto();
	Jugada spock = new JugadaSpock();
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals(piedra.jugarContra(piedra), "empate");
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals(piedra.jugarContra(papel), "papel");
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals(piedra.jugarContra(tijera), "piedra");
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals(piedra.jugarContra(lagarto), "piedra");
	}
	
	@Test
	public void testJugarContraSpock() {
		assertEquals(piedra.jugarContra(spock), "spock");
	}
	
}
