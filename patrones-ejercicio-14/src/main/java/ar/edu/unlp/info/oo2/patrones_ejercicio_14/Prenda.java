package ar.edu.unlp.info.oo2.patrones_ejercicio_14;

public abstract class Prenda {

	public Double valorPrendario() {
		return valor() * coeficienteDeLiquidez();
	}
	
	protected abstract Double valor();
	protected abstract Double coeficienteDeLiquidez(); 
	
}
