package parciales.arciales_d_10_6_2023;

public class SeguroContraTerceros extends Seguro {

	@Override
	protected Double costoCoberturaDanioTercerosPor(Vehiculo vehiculo) {
		return 1000.0 + (vehiculo.getValor() * 0.01);
	}
	
	@Override
	protected Double costoCoberturaDestruccionTotalPor(Vehiculo vehiculo) {
		return vehiculo.getValor() * 0.005;
	}
	
}
