package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

public class SWVeganoBuilder extends SandwichBuilder {
	
	@Override
	public void construirPan() {
		sandwich.setPan(new Componente("Pan integral", 100));
	}
	
	@Override
	public void construirAderezo() {
		sandwich.setAderezo(new Componente("Salsa criolla", 20));
	}

	@Override
	public void construirPrincipal() {
		sandwich.setPrincipal(new Componente("Milanesa de girgolas", 500));
	}

	@Override
	public void construirAdicional() {
		sandwich.setAdicional(new Componente("Sin adicional", 0));
	}
	
}
