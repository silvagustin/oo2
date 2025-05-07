package ar.edu.unlp.info.oo2.patrones_ejercicio_11;

public class TopografiaAgua extends Topografia {

	@Override
	public Double proporcionAgua() {
		return 1.0;
	}

	@Override
	public Double proporcionTierra() {
		return 0.0;
	}

	@Override
	public Boolean igual(Topografia topografia) {
		return proporcionAgua() == topografia.proporcionAgua() && proporcionTierra() == topografia.proporcionTierra(); 
	}

}
