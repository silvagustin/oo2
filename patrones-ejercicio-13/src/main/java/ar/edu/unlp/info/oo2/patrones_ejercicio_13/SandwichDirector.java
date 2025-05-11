package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

public class SandwichDirector {
	
	private SandwichBuilder builder;
	
	public SandwichDirector(SandwichBuilder builder) {
		this.builder = builder;
	}
	

	public void construirSandwich() {
		builder.reset();
		builder.construirPan();
		builder.construirAderezo();
		builder.construirPrincipal();
		builder.construirAdicional();
	}
	
}
