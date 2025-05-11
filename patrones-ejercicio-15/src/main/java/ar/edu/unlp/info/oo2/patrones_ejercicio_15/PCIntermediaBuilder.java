package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

public class PCIntermediaBuilder extends PCBuilder {

	@Override
	public void buildProcesador() {
		pc.setProcesador(new Componente("Procesador intermedio", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildMemoriaRAM() {
		pc.setMemoriaRAM(new Componente("16 GB", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildDisco() {
		pc.setDisco(new Componente("SSD 500 GB", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildTarjetaGrafica() {
		pc.setTarjetaGrafica(new Componente("GTX 1650", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildGabinete() {
		pc.setGabinete(new Componente("Gabinete intermedio", "Lorem ipsum", 100.5, 800.0));
	}
	
}
