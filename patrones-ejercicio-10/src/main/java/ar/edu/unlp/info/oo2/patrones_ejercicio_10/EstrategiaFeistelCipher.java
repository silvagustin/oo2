package ar.edu.unlp.info.oo2.patrones_ejercicio_10;

public class EstrategiaFeistelCipher extends EstrategiaDeCifrado {
	
	private FeistelCipher feistelCipher;
	
	public EstrategiaFeistelCipher(String key) {
		this.feistelCipher = new FeistelCipher(key); 
	}
	
	@Override
	public String encriptar(String mensaje) {
		return this.feistelCipher.encode(mensaje);
	}

	@Override
	public String desencriptar(String mensaje) {
		// Este algoritmo utiliza el mismo mensaje para descifrar
		return this.feistelCipher.encode(mensaje);
	}

}
