package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

public class SWClasicoBuilder extends SandwichBuilder {

	@Override
	public void construirPan() {
		sandwich.setPan(new Componente("Pan brioche", 100));
	}
	
	@Override
	public void construirAderezo() {
		sandwich.setAderezo(new Componente("Mayonesa", 20));
	}

	@Override
	public void construirPrincipal() {
		sandwich.setPrincipal(new Componente("Carne de ternera", 300));
	}

	@Override
	public void construirAdicional() {
		sandwich.setAdicional(new Componente("Tomate", 80));
	}
	
}
