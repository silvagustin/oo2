package ar.edu.unlp.info.oo2.ejercicio_2;

public class JugadaLagarto extends Jugada {

	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraLagarto();
	}

	@Override
	public String jugarContraPiedra() {
		return "piedra";
	}

	@Override
	public String jugarContraPapel() {
		return "lagarto";
	}

	@Override
	public String jugarContraTijera() {
		return "tijera";
	}

	@Override
	public String jugarContraLagarto() {
		return "empate";
	}

	@Override
	public String jugarContraSpock() {
		return "spock";
	}

}
