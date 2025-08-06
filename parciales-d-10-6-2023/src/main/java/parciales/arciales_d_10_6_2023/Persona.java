package parciales.arciales_d_10_6_2023;

import java.util.List;

public class Persona {

	private Integer edad;
	private List<Seguro> seguros;
	private List<Vehiculo> vehiculos;
	
	public Persona(Integer edad, List<Vehiculo> vehiculos, List<Seguro> seguros) {
		this.edad = edad;
		this.vehiculos = vehiculos;
		this.seguros = seguros;
	}
	
	public Integer getEdad() {
		return this.edad;
	}
	
}
