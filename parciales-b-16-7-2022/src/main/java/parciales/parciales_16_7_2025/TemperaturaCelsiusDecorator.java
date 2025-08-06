package parciales.parciales_16_7_2025;

public class TemperaturaCelsiusDecorator extends HWSDecorator {

	public TemperaturaCelsiusDecorator(HWSComponent weatherStation) {
		super(weatherStation);
	}
	
	public String displayData() {
		return super.displayData() + " Temperatura C: " + super.getTemperaturaCelsius();
	}

}
