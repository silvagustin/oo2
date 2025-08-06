package parciales.arciales_d_10_6_2023;

public class SeguroTercerosCompleto extends Seguro {

	@Override
	protected Double costoAdicionalEnSeguroDeVidaPor(Vehiculo vehiculo) {
		return 5000.0 + vehiculo.getCantMaxOcupantes();
	}
	
	@Override
	protected Double costoCoberturaDanioTercerosPor(Vehiculo vehiculo) {
		if (vehiculo.getAntiguedad() > 4) {
			return 4000.0 * vehiculo.getAntiguedad();
		} else {
			return 10000.0;
		}
	}
	
	@Override
	protected Double costoCoberturaDestruccionTotalPor(Vehiculo vehiculo) {
		return 0.005 * vehiculo.getValor() + 10000.0;
	}

}
