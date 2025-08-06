package parciales.parciales_16_7_2025;

public class PromedioFahrenheitDecorator extends HWSDecorator {

	public PromedioFahrenheitDecorator(HWSComponent weatherStation) {
		super(weatherStation);
	}
	
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas F: " + super.getPromedioTemperaturasFarenheit();
	}

}
