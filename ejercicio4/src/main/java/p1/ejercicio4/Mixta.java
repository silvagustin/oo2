package p1.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Mixta implements Topografia {
	
	private List<Topografia> topografias = new ArrayList<>();
	private final double LIMITE = 4.0;
	
	public Mixta(Topografia... topografias) {
		this.topografias.addAll(Arrays.asList(topografias));
	}
	
	
	public void add(Topografia topografia) {
		if (topografias.size() < LIMITE) {
			topografias.add(topografia);
		}
	}
	
	public void remove(Topografia topografia) {
		topografias.remove(topografia);
	}
	
	@Override
	public double proporcionTierra() {
		if (topografias.size() == 0) {
			return 0;
		} else {
			return topografias.stream().mapToDouble(topografia -> topografia.proporcionTierra()).sum() / LIMITE;
		}
	}
	
	@Override
	public double proporcionAgua() {
		if (topografias.size() == 0) {
			return 0;
		} else {
			return topografias.stream().mapToDouble(topografia -> topografia.proporcionAgua()).sum() / LIMITE;
		}
	}


	@Override
	public boolean igual(Topografia topografia) {
		// Como implementar esto? Porque no puedo hacer: this.topografias.equals(topografia.getTopografias());
	}

}
