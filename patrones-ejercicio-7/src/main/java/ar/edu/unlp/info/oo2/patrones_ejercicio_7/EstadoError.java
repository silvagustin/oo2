package ar.edu.unlp.info.oo2.patrones_ejercicio_7;

public class EstadoError extends Estado {

	@Override
	public void setValor(Calculadora calculadora, Double valor) {
		throw new RuntimeException("Error! No se puede sumar desde el estado de error");
	}

	@Override
	public String getResultado(Calculadora calculadora) {
		return "error";
	}
	
	@Override
	public void mas(Calculadora calculadora) {
		throw new RuntimeException("Error! No se puede sumar desde el estado de error");
	}

}
