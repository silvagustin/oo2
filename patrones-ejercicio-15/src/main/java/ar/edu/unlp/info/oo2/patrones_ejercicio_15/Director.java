package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

public class Director {
	
	public PC build(PCBuilder builder) {
		builder.reset();
		builder.setProcesador();
		builder.setMemoriaRAM();
		builder.setDisco();
		builder.setTarjetaGrafica();
		builder.setGabinete();
		
		return builder.getPC();
	}
	
}
