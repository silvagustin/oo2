package parciales.parciales_16_7_2025;

public class PresionAtmosfericaDecorator extends HWSDecorator {

	public PresionAtmosfericaDecorator(HWSComponent weatherStation) {
		super(weatherStation);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Presion atmosferica: " + super.getPresion(); 
	}
	
}
