package parciales.parciales_16_7_2025;

import java.util.List;
import java.util.stream.Collectors;

public class HWSExtension extends HomeWeatherStation implements HWSComponent {
	
	@Override
	public Double getTemperaturaCelsius() {
		return this.toCelcius(this.getTemperaturaFahrenheit());
	}
	
	public List<Double> getTemperaturasCelcius() {
		return getTemperaturasFahrenheit().stream().map(temperatura -> this.toCelcius(temperatura)).collect(Collectors.toList());
	}
	
	@Override
	public Double getPromedioDeTemperaturasCelsius() {
		return this.getPromedioTemperaturas(this.getTemperaturasCelcius());
	}
	
	@Override
	public Double getPromedioTemperaturasFarenheit() {
		return this.getPromedioTemperaturas(getTemperaturasFahrenheit());
	}
	
	private Double getPromedioTemperaturas(List<Double> temperaturas) {
		return temperaturas.stream().mapToDouble(temperatura -> temperatura).average().orElse(0);
	}
	
	private Double toCelcius(Double temperatura) {
		return ((temperatura - 32) + 1.8);
	}

	@Override
	public String displayData() {
		return "";
	}
	
}
