package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

public class PCBasicoBuilder extends PCBuilder {

	@Override
	public void buildProcesador() {
		pc.setProcesador(new Componente("Procesador basico", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildMemoriaRAM() {
		pc.setMemoriaRAM(new Componente("8 GB", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildDisco() {
		pc.setDisco(new Componente("HDD 500 GB", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildTarjetaGrafica() {
		pc.setTarjetaGrafica(new Componente("No posee (integrada)", "", 0.0, 0.0));
	}

	@Override
	public void buildGabinete() {
		pc.setGabinete(new Componente("Gabinete estandar (ya viene con fuente)", "Lorem ipsum", 100.5, 20.0));
	}
	
}
