package parciales.parciales_16_7_2025;

public class RadiacionSolarDecorator extends HWSDecorator {

	public RadiacionSolarDecorator(HWSComponent weatherStation) {
		super(weatherStation);
	}

	public String displayData() {
		return super.displayData() + " Radiacion solar: " + super.getRadiacionSolar();
	}
	
}
