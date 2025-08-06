package parciales.parciales_16_7_2025;

public class TemperaturaFahrenheitDecorator extends HWSDecorator {

	public TemperaturaFahrenheitDecorator(HWSComponent weatherStation) {
		super(weatherStation);
	}
	
	public String displayData() {
		return super.displayData() + " Temperatura F: " + super.getTemperaturaFahrenheit();
	}

}
