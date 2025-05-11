package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

public class PCGamerBuilder extends PCBuilder {
	
	@Override
	public void buildProcesador() {
		pc.setProcesador(new Componente("Procesador Gamer. Hay que agregar un pad termico y un cooler", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildMemoriaRAM() {
		pc.setMemoriaRAM(new Componente("32 GB + 32 GB", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildDisco() {
		pc.setDisco(new Componente("SSD 500gb + SSD 1 TB", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildTarjetaGrafica() {
		pc.setTarjetaGrafica(new Componente("RTX 4090", "Lorem ipsum", 100.5, 20.0));
	}

	@Override
	public void buildGabinete() {
		pc.setGabinete(new Componente("Gabinete Gamer", "Lorem ipsum", 100.5, calcularFuenteRequerida()));
	}
	
	/**
	 * Para saber que fuente requiere, se debe sumar el consumo de sus componentes + 50% de ese consumo. 
	 * Luego ese resultado debe ser incluido en la descripcion de la forma fuente consumo w.
	 * @return String
	 * 
	 */
	private Double calcularFuenteRequerida() {
		Double consumo = pc.calcularConsumo();
		
		return consumo + (consumo * 0.5);
	}
	
}
