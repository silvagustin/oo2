package parciales.arciales_d_10_6_2023;

public class Vehiculo {

	private Double valor;
	private Integer cantMaxOcupantes, antiguedad;
	
	private Seguro seguro;
	
	public Vehiculo(Double valor, Integer cantMaxOcupantes, Integer antiguedad, Seguro seguro) {
		this.valor = valor;
		this.cantMaxOcupantes = cantMaxOcupantes;
		this.antiguedad = antiguedad;
		this.seguro = seguro;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	public Integer getCantMaxOcupantes() {
		return this.cantMaxOcupantes;
	}
	
	public Integer getAntiguedad() {
		return this.antiguedad;
	}
	
}
