package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JugadaSpockTest {
	
	Jugada piedra = new JugadaPiedra();
	Jugada papel = new JugadaPapel();
	Jugada tijera = new JugadaTijera();
	Jugada lagarto = new JugadaLagarto();
	Jugada spock = new JugadaSpock();
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals(spock.jugarContra(piedra), "spock");
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals(spock.jugarContra(papel), "papel");
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals(spock.jugarContra(tijera), "spock");
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals(spock.jugarContra(lagarto), "spock");
	}
	
	@Test
	public void testJugarContraSpock() {
		assertEquals(spock.jugarContra(spock), "empate");
	}
	
}
