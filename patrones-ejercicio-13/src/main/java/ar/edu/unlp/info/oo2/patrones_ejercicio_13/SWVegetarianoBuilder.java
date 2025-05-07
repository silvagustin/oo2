package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

public class SWVegetarianoBuilder extends SandwichBuilder {

	@Override
	public void construirPan() {
		sandwich.setPan(new Componente("Pan con semillas", 120));
	}
	
	@Override
	public void construirAderezo() {
		sandwich.setAderezo(new Componente("Sin aderezo", 0));
	}

	@Override
	public void construirPrincipal() {
		sandwich.setPrincipal(new Componente("Provoleta grillada", 200));
	}

	@Override
	public void construirAdicional() {
		sandwich.setAdicional(new Componente("Berenjenas al escabeche", 100));
	}
	
}
