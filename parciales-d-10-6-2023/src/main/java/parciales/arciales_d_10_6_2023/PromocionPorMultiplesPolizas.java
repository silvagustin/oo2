package parciales.arciales_d_10_6_2023;

import java.util.List;

public class PromocionPorMultiplesPolizas implements Promocion {

	@Override
	public Double calcularMonto(List<Seguro> seguros) {
		if (seguros.size() >= 2) {
			seguros.stream()
					.mapToDouble(seguro -> seguro.calcularCostoTotal())
					.sum();
		} else {
			return 0.0;
		}
	}

}
