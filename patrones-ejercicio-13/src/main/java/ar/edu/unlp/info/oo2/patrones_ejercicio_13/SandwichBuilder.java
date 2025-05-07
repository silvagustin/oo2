package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

public abstract class SandwichBuilder {
	
	protected Sandwich sandwich;
	
	public void reset() {
		this.sandwich = new Sandwich();
	}
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
	
	public abstract void construirPan();
	public abstract void construirAderezo();
	public abstract void construirPrincipal();
	public abstract void construirAdicional();
	
}
