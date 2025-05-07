package ar.edu.unlp.info.oo2.ejercicio_2;

public class JugadaPapel extends Jugada {
	
	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraPapel();
	}

	@Override
	public String jugarContraPiedra() {
		return "papel";
	}

	@Override
	public String jugarContraPapel() {
		return "empate";
	}

	@Override
	public String jugarContraTijera() {
		return "tijera";
	}

	@Override
	public String jugarContraLagarto() {
		return "lagarto";
	}

	@Override
	public String jugarContraSpock() {
		return "papel";
	}

}
