package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JugadaTijeraTest {
	
	Jugada piedra = new JugadaPiedra();
	Jugada papel = new JugadaPapel();
	Jugada tijera = new JugadaTijera();
	Jugada lagarto = new JugadaLagarto();
	Jugada spock = new JugadaSpock();
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals(tijera.jugarContra(piedra), "piedra");
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals(tijera.jugarContra(papel), "tijera");
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals(tijera.jugarContra(tijera), "empate");
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals(tijera.jugarContra(lagarto), "tijera");
	}
	
	@Test
	public void testJugarContraSpock() {
		assertEquals(tijera.jugarContra(spock), "spock");
	}
	
}
