package ar.edu.unlp.info.oo2.ejercicio_2;

public class JugadaTijera extends Jugada {

	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraTijera();
	}

	@Override
	public String jugarContraPiedra() {
		return "piedra";
	}

	@Override
	public String jugarContraPapel() {
		return "tijera";
	}

	@Override
	public String jugarContraTijera() {
		return "empate";
	}

	@Override
	public String jugarContraLagarto() {
		return "tijera";
	}

	@Override
	public String jugarContraSpock() {
		return "spock";
	}

}
