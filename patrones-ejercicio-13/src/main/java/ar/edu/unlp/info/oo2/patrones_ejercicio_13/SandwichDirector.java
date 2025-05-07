package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

public class SandwichDirector {

	public void construirSandwich(SandwichBuilder builder) {
		builder.reset();
		builder.construirPan();
		builder.construirAderezo();
		builder.construirPrincipal();
		builder.construirAdicional();
	}
	
}
