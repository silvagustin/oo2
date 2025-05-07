package ar.edu.unlp.info.oo2.patrones_ejercicio_11;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta extends Topografia {
	
	private List<Topografia> topografias = new ArrayList<Topografia>();
	private final Integer MAX_TOPOGRAFIAS = 4;

	@Override
	public Double proporcionAgua() {
		return topografias.stream()
				   		  .mapToDouble(topografia -> topografia.proporcionAgua())
				   		  .average()
				   		  .orElse(0.0);
	}

	@Override
	public Double proporcionTierra() {
		return topografias.stream()
		   		  		  .mapToDouble(topografia -> topografia.proporcionTierra())
		   		  		  .average()
		   		  		  .orElse(0.0);
	}

	@Override
	public Boolean igual(Topografia unaTopografia) {
		return topografias.equals(((TopografiaMixta) unaTopografia).getTopografias());
		
		//return topografias.stream()
		//				  .allMatch(topografia -> topografia.igual(unaTopografia));
	}
	
	public void agregarTopografia(Topografia topografia) {
		if (topografias.size() < MAX_TOPOGRAFIAS) {
			topografias.add(topografia);
		}
	}
	
	public void eliminarTopografia(Topografia topografia) {
		topografias.remove(topografia);
	}
	
	public List<Topografia> getTopografias() {
		return this.topografias;
	}
	
	/**
	private Boolean esValida() throws Exception {
		if (topografias.size() == MAX_TOPOGRAFIAS) {
			return true;
		} else {
			throw new Exception("Faltan agregar topografias");
		}
	}
	*/

}
