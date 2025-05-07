package ar.edu.unlp.info.oo2.patrones_ejercicio_10;

public class Mensajero {
	
	private EstrategiaDeCifrado estrategiaDeCifrado;

	public void enviar(String mensaje) {
		estrategiaDeCifrado.encriptar(mensaje);
	}
	
	public void recibir(String mensaje) {
		estrategiaDeCifrado.desencriptar(mensaje);
	}
	
	public void setEstrategiaDeCifrado(EstrategiaDeCifrado estrategia) {
		this.estrategiaDeCifrado = estrategia;
	}
	
}
