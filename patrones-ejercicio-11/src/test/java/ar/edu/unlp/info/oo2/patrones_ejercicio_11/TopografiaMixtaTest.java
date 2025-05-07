package ar.edu.unlp.info.oo2.patrones_ejercicio_11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaMixtaTest {
	
	TopografiaMixta topografiaMixta1;
	TopografiaMixta topografiaMixta2;
	
	@BeforeEach
	void setUp() throws Exception {
		Topografia agua = new TopografiaAgua();
		Topografia tierra = new TopografiaTierra();

		topografiaMixta1 = new TopografiaMixta();
		
		topografiaMixta1.agregarTopografia(agua);
		topografiaMixta1.agregarTopografia(tierra);
		topografiaMixta1.agregarTopografia(agua);
		topografiaMixta1.agregarTopografia(tierra);
		
		topografiaMixta2 = new TopografiaMixta();
		
		topografiaMixta2.agregarTopografia(tierra);
		topografiaMixta2.agregarTopografia(agua);
		topografiaMixta2.agregarTopografia(tierra);
		topografiaMixta2.agregarTopografia(agua);
	}
	
	@Test
	void testProporcionAgua() {
		assertEquals(0.5, topografiaMixta1.proporcionAgua());
	}
	
	@Test
	void testProporcionTierra() {
		assertEquals(0.5, topografiaMixta1.proporcionTierra());
	}
	
	@Test
	void testIgual() {
		assertTrue(topografiaMixta1.igual(topografiaMixta1));
		assertFalse(topografiaMixta1.igual(topografiaMixta2));
	}
	
}
