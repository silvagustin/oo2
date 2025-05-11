package ar.edu.unlp.info.oo2.patrones_ejercicio_15;

public abstract class PCBuilder {

	protected PC pc;
	
	public void reset() {
		this.pc = new PC();
	}
	
	public PC getPC() {
		return this.pc;
	}
	
	public abstract void buildProcesador();
	public abstract void buildMemoriaRAM();
	public abstract void buildDisco();
	public abstract void buildTarjetaGrafica();
	public abstract void buildGabinete();
	
}
