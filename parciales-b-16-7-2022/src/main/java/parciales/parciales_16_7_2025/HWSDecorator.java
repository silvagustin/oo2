package parciales.parciales_16_7_2025;

public abstract class HWSDecorator implements HWSComponent {

	private HWSComponent weatherStation;
	
	public HWSDecorator(HWSComponent weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	@Override
	public Double getTemperaturaFahrenheit() {
		return this.weatherStation.getTemperaturaFahrenheit();
	}

	@Override
	public Double getTemperaturaCelsius() {
		return this.weatherStation.getTemperaturaCelsius();
	}

	@Override
	public Double getPresion() {
		return this.weatherStation.getPresion();
	}

	@Override
	public Double getRadiacionSolar() {
		return this.weatherStation.getRadiacionSolar();
	}

	@Override
	public Double getPromedioDeTemperaturasCelsius() {
		return this.weatherStation.getPromedioDeTemperaturasCelsius();
	}

	@Override
	public Double getPromedioTemperaturasFarenheit() {
		return this.weatherStation.getPromedioTemperaturasFarenheit();
	}

	@Override
	public String displayData() {
		return this.weatherStation.displayData();
	}
	
}
