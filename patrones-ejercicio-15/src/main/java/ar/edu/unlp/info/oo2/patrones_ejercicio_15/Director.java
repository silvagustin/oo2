package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

public class Director {
	
	private PCBuilder builder;
	
	public Director(PCBuilder builder) {
		this.builder = builder;
	}
	
	public PC build() {
		builder.reset();
		builder.buildProcesador();
		builder.buildMemoriaRAM();
		builder.buildDisco();
		builder.buildTarjetaGrafica();
		builder.buildGabinete();
		
		return builder.getPC();
	}
	
}
