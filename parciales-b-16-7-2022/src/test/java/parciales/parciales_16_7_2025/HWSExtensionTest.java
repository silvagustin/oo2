package parciales.parciales_16_7_2025;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HWSExtensionTest {

	private HWSExtension weatherStation;
	private List<Double> temperaturas;
	private HWSDecorator decorator; 
	
	@BeforeEach
	public void setUp() {
		weatherStation = new HWSExtension();
		
		weatherStation.setTemperaturaFahrenheit(300.0);
		weatherStation.setPresion(1008.0);
		weatherStation.setRadiacionSolar(500.0);
		
		temperaturas = new ArrayList<Double>();
		
		temperaturas.add(500.0);
		temperaturas.add(300.0);
		temperaturas.add(1000.0);
		
		weatherStation.setTemperaturas(temperaturas);
	}
	
	@Test
	public void ejemplo1Test() {
		decorator = new PresionAtmosfericaDecorator(weatherStation);
		
		assertEquals(" Presion atmosferica: 1008.0", decorator.displayData());
	}
	
	@Test
	public void ejemplo2Test() {
		decorator = new PresionAtmosfericaDecorator(weatherStation);
		decorator = new RadiacionSolarDecorator(decorator);
		
		assertEquals(" Presion atmosferica: 1008.0 Radiacion solar: 500.0", decorator.displayData());
	}
	
	@Test
	public void ejemplo3Test() {
		decorator = new RadiacionSolarDecorator(weatherStation);
		decorator = new TemperaturaFahrenheitDecorator(decorator);
		decorator = new PromedioFahrenheitDecorator(decorator);
		
		assertEquals(" Radiacion solar: 500.0 Temperatura F: 300.0 Promedio de temperaturas F: 600.0", decorator.displayData());
	}
}
