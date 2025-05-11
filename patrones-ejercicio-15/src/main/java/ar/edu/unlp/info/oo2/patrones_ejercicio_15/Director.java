package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

public class Director {
	
	public PC build(PCBuilder builder) {
		builder.reset();
		builder.buildProcesador();
		builder.buildMemoriaRAM();
		builder.buildDisco();
		builder.buildTarjetaGrafica();
		builder.buildGabinete();
		
		return builder.getPC();
	}
	
}
