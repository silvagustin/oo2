package ar.edu.unlp.info.oo2.patrones_ejercicio_10;

public class EstrategiaRC4 extends EstrategiaDeCifrado {
	
	private String key;
	private RC4 rc4;
	
	public EstrategiaRC4(String key) {
		this.key = key;
		this.rc4 = new RC4();
	}

	@Override
	public String encriptar(String mensaje) {
		return rc4.encriptar(mensaje, this.key);
	}

	@Override
	public String desencriptar(String mensaje) {
		return rc4.desencriptar(mensaje, this.key);
	}

}
