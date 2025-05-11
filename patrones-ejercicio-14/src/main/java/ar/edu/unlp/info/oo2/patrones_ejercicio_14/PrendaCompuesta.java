package ar.edu.unlp.info.oo2.patrones_ejercicio_14;

import java.util.ArrayList;
import java.util.List;

public class PrendaCompuesta extends Prenda {

	private List<Prenda> prendas = new ArrayList<Prenda>();

	@Override
	protected Double valor() {
		return prendas.stream()
					  .mapToDouble(prenda -> prenda.valor())
					  .sum();
	}

	@Override
	protected Double coeficienteDeLiquidez() {
		return prendas.stream()
				  .mapToDouble(prenda -> prenda.coeficienteDeLiquidez())
				  .sum() * 0.5;
	}
	
	public void agregarPrenda(Prenda prenda) throws Exception {
		if (prenda instanceof PrendaCompuesta) {
			throw new Exception("No se pueden anidar prendas compuestas");
		} else {
			prendas.add(prenda);
		}
	}
	
}
