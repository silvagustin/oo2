package parciales.arciales_d_10_6_2023;

public class SeguroTodoRiesgo extends Seguro {

	@Override
	protected Double costoAdicionalEnSeguroDeVidaPor(Vehiculo vehiculo) {
		return 9000.0 * vehiculo.getAntiguedad();
	}
	
	@Override
	protected Double costoCoberturaDanioTercerosPor(Persona conductor) {
		return 100000.0 / conductor.getEdad();
	}

	@Override
	protected Double costoCoberturaDestruccionTotalPor(Vehiculo vehiculo) {
		return 0.005 * vehiculo.getValor() + 1000.0 * vehiculo.getAntiguedad();
	}

}
