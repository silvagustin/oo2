package parciales.parciale_e_1_7_2023;

public class TareaSimple extends Tarea {
	
	private Integer duracionEstimada;
	private long iniciadoEn, completadoEn;
	private Estado estado;
	
	public TareaSimple(String nombre, Integer duracionEstimada) {
		this.nombre = nombre;
		this.duracionEstimada = duracionEstimada;
		
		estado = new EstadoPendiente();
	}
	
	@Override
	protected Integer getDuracionEstimada() {
		return this.duracionEstimada;
	}
	
	@Override
	protected long tiempoUtilizado() {
		return estado.tiempoUtilizado(this);
	}
	
	@Override
	public void iniciar() {
		estado.iniciar(this);
	}
	
	@Override
	public void completar() {
		estado.completar(this);
	}
	
	public long getIniciadoEn() {
		return this.iniciadoEn;
	}
	
	public long getCompletadoEn() {
		return this.completadoEn;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void setIniciadoEn(long iniciadoEn) {
		this.iniciadoEn = iniciadoEn;
	}

	public void setCompletadoEn(long completadoEn) {
		this.completadoEn = completadoEn;
	}
	
}
