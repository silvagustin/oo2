package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

public class SWSinTACCBuilder extends SandwichBuilder {
	
	@Override
	public void construirPan() {
		sandwich.setPan(new Componente("Pan de chipa", 150));
	}
	
	@Override
	public void construirAderezo() {
		sandwich.setAderezo(new Componente("Salsa tartara", 18));
	}

	@Override
	public void construirPrincipal() {
		sandwich.setPrincipal(new Componente("Carne de pollo", 250));
	}

	@Override
	public void construirAdicional() {
		sandwich.setAdicional(new Componente("Verduras grilladas", 200));
	}
	
}
