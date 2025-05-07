package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SandwichTest {
	
	SandwichDirector director;
	SandwichBuilder swClasicoBuilder, swVegetarianoBuilder, swVeganoBuilder, swSinTACCBuilder;

	@BeforeEach
	void setUp() throws Exception {
		director = new SandwichDirector();
		
		swClasicoBuilder = new SWClasicoBuilder();
		swVegetarianoBuilder = new SWVegetarianoBuilder();
		swVeganoBuilder = new SWVeganoBuilder();
		swSinTACCBuilder = new SWSinTACCBuilder();
		
		director.construirSandwich(swClasicoBuilder);
		director.construirSandwich(swVegetarianoBuilder);
		director.construirSandwich(swVeganoBuilder);
		director.construirSandwich(swSinTACCBuilder);
		
		System.out.println(swClasicoBuilder.getSandwich());
		System.out.println(swVegetarianoBuilder.getSandwich());
		System.out.println(swVeganoBuilder.getSandwich());
		System.out.println(swSinTACCBuilder.getSandwich());
	}
	
	@Test
	public void testSandwich() {
		assertNotNull(swClasicoBuilder.getSandwich());
		assertNotNull(swVegetarianoBuilder.getSandwich());
		assertNotNull(swVeganoBuilder.getSandwich());
		assertNotNull(swSinTACCBuilder.getSandwich());
	}
	
}
