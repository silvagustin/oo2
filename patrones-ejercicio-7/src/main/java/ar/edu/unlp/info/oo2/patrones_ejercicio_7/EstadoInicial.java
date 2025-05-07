package ar.edu.unlp.info.oo2.patrones_ejercicio_7;

public class EstadoInicial extends Estado {

	@Override
	public void setValor(Calculadora calculadora, Double valor) {
		calculadora.setValorAcumulado(valor);
	}
	
	@Override
	public String getResultado(Calculadora calculadora) {
		return calculadora.getValorAcumulado().toString();
	}

	@Override
	public void mas(Calculadora calculadora) {
		calculadora.setEstado(new EstadoSumando());
	}
	
}
