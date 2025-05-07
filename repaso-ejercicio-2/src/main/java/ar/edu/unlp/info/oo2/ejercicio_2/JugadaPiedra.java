package ar.edu.unlp.info.oo2.ejercicio_2;

public class JugadaPiedra extends Jugada {
	
	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraPiedra();
	}
	
	@Override
	public String jugarContraPiedra() {
		return "empate";
	}
	
	@Override
	public String jugarContraPapel() {
		return "piedra";
	}
	
	@Override
	public String jugarContraTijera() {
		return "piedra";
	}

	@Override
	public String jugarContraLagarto() {
		return "piedra";
	}

	@Override
	public String jugarContraSpock() {
		return "spock";
	}
	
}
