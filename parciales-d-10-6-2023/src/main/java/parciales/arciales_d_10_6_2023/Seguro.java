package parciales.arciales_d_10_6_2023;

// EJERCICIO INCOMPLETO - resta la parte de promociones y calcular lo que tiene que abonar una Persona

public abstract class Seguro {
	
	public Double calcularCostoTotal(Persona conductor, Vehiculo vehiculo) {
		return this.calcularCostoSeguroVida(conductor, vehiculo) +
				this.calcularCostoCoberturaDanioTerceros(conductor, vehiculo) +
				this.calcularCostoCoberturaDestruccionTotal(conductor, vehiculo);
	}
	
	// Seguro de vida
	
	public Double calcularCostoSeguroVida(Persona conductor, Vehiculo vehiculo) {
		return this.calcularCostoSeguroDelConductor(conductor) + 
				this.costoAdicionalEnSeguroDeVidaPor(conductor) +
				this.costoAdicionalEnSeguroDeVidaPor(vehiculo);
	}
	
	private Double calcularCostoSeguroDelConductor(Persona conductor) {
		return 100.0 * conductor.getEdad(); 
	}
	
	protected Double costoAdicionalEnSeguroDeVidaPor(Persona conductor) {
		return 0.0;
	}
	
	protected Double costoAdicionalEnSeguroDeVidaPor(Vehiculo vehiculo) {
		return 0.0;
	}
	
	// Cobertura de danios a otros vehiculos
	
	public Double calcularCostoCoberturaDanioTerceros(Persona conductor, Vehiculo vehiculo) {
		return this.costoCoberturaDanioTercerosPor(conductor) + this.costoCoberturaDanioTercerosPor(vehiculo); 
	}
	
	protected Double costoCoberturaDanioTercerosPor(Persona conductor) {
		return 0.0;
	}
	
	protected Double costoCoberturaDanioTercerosPor(Vehiculo vehiculo) {
		return 0.0;
	}
	
	// Cobertura de destruccion total
	

	public Double calcularCostoCoberturaDestruccionTotal(Persona conductor, Vehiculo vehiculo) {
		return this.costoCoberturaDestruccionTotalPor(conductor) + this.costoCoberturaDestruccionTotalPor(vehiculo); 
	}

	protected Double costoCoberturaDestruccionTotalPor(Persona conductor) {
		return 0.0;
	}
	
	protected Double costoCoberturaDestruccionTotalPor(Vehiculo vehiculo) {
		return 0.0;
	}
	
}
