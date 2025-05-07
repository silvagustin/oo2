package ar.edu.unlp.info.oo2.patrones_ejercicio_7;

public abstract class Estado {

	public abstract void setValor(Calculadora calculadora, Double valor);
	public abstract String getResultado(Calculadora calculadora);
	public abstract void mas(Calculadora calculadora);
	
}
