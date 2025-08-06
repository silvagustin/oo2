package parciales.parciales_16_7_2025;

public class PromedioCelsiusDecorator extends HWSDecorator {

	public PromedioCelsiusDecorator(HWSComponent weatherStation) {
		super(weatherStation);
	}
	
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas C: " + super.getPromedioDeTemperaturasCelsius();
	}
	
}
