package p1.ejercicio4;

public class Pantano implements Topografia {
	
	@Override
	public double proporcionTierra() {
		return 0.3;
	}
	
	@Override
	public double proporcionAgua() {
		return 0.7;
	}
	
	@Override
	public boolean igual(Topografia topografia) {
		if (proporcionTierra() == topografia.proporcionTierra() && proporcionAgua() == topografia.proporcionAgua()) {
			return true;
		} else {
			return false;
		}
	}

}
