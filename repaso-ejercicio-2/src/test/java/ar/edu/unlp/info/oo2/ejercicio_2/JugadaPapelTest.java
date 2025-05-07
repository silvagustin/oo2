package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JugadaPapelTest {
	
	Jugada piedra = new JugadaPiedra();
	Jugada papel = new JugadaPapel();
	Jugada tijera = new JugadaTijera();
	Jugada lagarto = new JugadaLagarto();
	Jugada spock = new JugadaSpock();
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals(papel.jugarContra(piedra), "piedra");
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals(papel.jugarContra(papel), "empate");
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals(papel.jugarContra(tijera), "tijera");
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals(papel.jugarContra(lagarto), "lagarto");
	}
	
	@Test
	public void testJugarContraSpock() {
		assertEquals(papel.jugarContra(spock), "papel");
	}
	
}
