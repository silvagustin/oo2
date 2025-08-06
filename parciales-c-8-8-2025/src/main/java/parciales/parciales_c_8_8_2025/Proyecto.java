package parciales.parciales_c_8_8_2025;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

	private LocalDate fechaDeInicio, fechaDeFin;
	private String nombre, objetivo;
	private Double margenDeGanancia, montoDePagoDiario;
	private Integer cantIntegrantes;
	
	private Estado estado;
	
	public Proyecto(String nombre, String objetivo, LocalDate fechaDeInicio, LocalDate fechaDeFin, Double montoDePagoDiario, Integer cantIntegrantes) {
		this.nombre = nombre;
		this.objetivo = objetivo;
		this.cantIntegrantes = cantIntegrantes;
		this.montoDePagoDiario = montoDePagoDiario;
		this.margenDeGanancia = 7.0;
		
		 // LocalDate date1 = LocalDate.of(2025, 6, 26);
	     // LocalDate date2 = LocalDate.of(2025, 7, 1);
		
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
		
		estado = new EstadoEnConstruccion();
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void aprobar() {
		estado.aprobar(this);
	}
	
	public Double calcularCosto() {
        long diasDeDiferencia = ChronoUnit.DAYS.between(this.fechaDeInicio, this.fechaDeFin);
		
		return (double) (this.cantIntegrantes * diasDeDiferencia);
	}
	
	public Double calcularPrecio() {
		return this.calcularCosto() * this.margenDeGanancia;
	}
	
	public void setMargenDeGanancia(Double margenDeGanancia) {
		estado.setMargenDeGanancia(this, margenDeGanancia);
	}
	
	public void doSetMargenDeGanancia(Double margenDeGanancia) {
		this.margenDeGanancia = margenDeGanancia;
	}

	public void actualizarObjetivoACancelado() {
		this.objetivo = "(Cancelado) " + this.objetivo;
	}
	
}
