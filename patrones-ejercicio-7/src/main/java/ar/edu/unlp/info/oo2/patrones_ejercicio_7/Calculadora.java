package ar.edu.unlp.info.oo2.patrones_ejercicio_7;

public class Calculadora {

	private Double valorAcumulado;
	private Estado estadoActual;
	
	public Calculadora() {
		borrar();
	}
	
	public Double getValorAcumulado() {
		return valorAcumulado;
	}
	
	public void setEstado(Estado unEstado) {
		this.estadoActual = unEstado;
	}
	
	public void setValorAcumulado(Double unValor) {
		this.valorAcumulado = unValor;
	}
	
	/**
	 * Devuelve el resultado actual de la operacion realizada.
	 * Si no se ha realizado ninguna operacion, devuelve el valor acumulado.
	 * Si la calculadora se encuentra en error, devuelve "error".
	 */
	public String getResultado() {
		return estadoActual.getResultado(this);
	}
	
	/**
	 * Pone en cero el valor acumulado y reinicia la calculadora.
	 */
	public void borrar() {
		valorAcumulado = 0.0;
		estadoActual = new EstadoInicial();
	}
	
	/**
	 * Asigna un valor para operar.
	 * Si hay una operacion en curso, el valor sera utilizado en la operacion.
	 */
	public void setValor(Double unValor) {
		estadoActual.setValor(this, unValor);
	}
	
	/**
	 * Indica que la calculadora debe esperar un nuevo valor.
	 * Si a continuacion se le envia el mensaje setValor(), la calculadora sumara
	 * el valor recibido como parametro, al valor actual y guardara el resultado.
	 */
	public void mas() {
		estadoActual.mas(this);
	}
	
}
