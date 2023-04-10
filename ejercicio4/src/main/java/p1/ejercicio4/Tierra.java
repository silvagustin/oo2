package p1.ejercicio4;

public class Tierra implements Topografia {
	
	@Override
	public double proporcionTierra() {
		return 1;
	}
	
	@Override
	public double proporcionAgua() {
		return 0;
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
