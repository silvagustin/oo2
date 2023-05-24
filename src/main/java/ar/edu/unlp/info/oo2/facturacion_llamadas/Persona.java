package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();

	private String tipoPersona;
	private String nombreApellido;
	private String numeroTelefono;
	private String cuit;
	private String documento;

	private CalcularDescuentoStrategy calcularDescuentoStrategy;

	public Persona(String nombreApellido, String tipoPersona, String numeroTelefono, String documento) {
		this.nombreApellido    				 = nombreApellido;
		this.tipoPersona       				 = tipoPersona;
		this.numeroTelefono    				 = numeroTelefono;
		this.documento   	     				 = documento;
		this.calcularDescuentoStrategy = setDefaultCalcularDescuentoStrategy();
	}

	public List<Llamada> getLlamadas() {
		return llamadas;
	}

	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void agregarLlamada(Llamada llamada) {
		llamadas.add(llamada);
	}

	public double calcularDescuentoSegunTipoPersona(double montoLlamada) {
		return calcularDescuentoStrategy.calcularDescuento(montoLlamada);
	}

	public CalcularDescuentoStrategy setDefaultCalcularDescuentoStrategy() {
		if (tipoPersona == "fisica") {
			return new CalcularDescuentoPersonaFisicaStrategy();
		} else if (tipoPersona == "juridica")  {
			return new CalcularDescuentoPersonaJuridicaStrategy();
		} else {
			return new CalcularDescuentoPersonaOtraStrategy();
		}
	}

}
