package parciales.parciales_16_7_2025;

import java.util.List;

public class HomeWeatherStation {
	
	private Double temperaturaFahrenheit, presion, radiacionSolar;
	private List<Double> temperaturas;

	// Retorna la temperatura en grados Fahrenheit
	public Double getTemperaturaFahrenheit() {
		return this.temperaturaFahrenheit;
	}
	
	// Retorna la presion atmosferica en hPa
	public Double getPresion() {
		return this.presion;
	}
	
	// Retorna la radiacion solar
	public Double getRadiacionSolar() {
		return this.radiacionSolar;
	}
	
	// Retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit() {
		return this.temperaturas;
	}
	
	public void setTemperaturaFahrenheit(Double temperaturaFahrenheit) {
		this.temperaturaFahrenheit = temperaturaFahrenheit;
	}
	
	public void setPresion(Double presion) {
		this.presion = presion;
	}
	
	public void setRadiacionSolar(Double radiacionSolar) {
		this.radiacionSolar = radiacionSolar;
	}
	
	public void setTemperaturas(List<Double> temperaturas) {
		this.temperaturas = temperaturas;
	}
	
}
