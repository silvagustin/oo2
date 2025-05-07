package ar.edu.unlp.info.oo2.ejercicio_2;

public class JugadaSpock extends Jugada {

	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraSpock();
	}

	@Override
	public String jugarContraPiedra() {
		return "spock";
	}

	@Override
	public String jugarContraPapel() {
		return "papel";
	}

	@Override
	public String jugarContraTijera() {
		return "spock";
	}

	@Override
	public String jugarContraLagarto() {
		return "spock";
	}

	@Override
	public String jugarContraSpock() {
		return "empate";
	}

}
