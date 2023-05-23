package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	public List<Llamada> llamadas = new ArrayList<Llamada>();

	public Personal sistema;

	public String tipoPersona;
	public String nombreApellido;
	public String numeroTelefono;
	public String cuit;
	public String documento;

	public Persona(String nombreApellido, String tipoPersona, String numeroTelefono, String documento, Personal sistema) {
		this.nombreApellido = nombreApellido;
		this.tipoPersona    = tipoPersona;
		this.numeroTelefono = numeroTelefono;
		this.documento   	  = documento;
		this.sistema        = sistema;
	}

	public List<Llamada> getLlamadas() {
		return llamadas;
	}

	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}

	public Personal getSistema() {
		return sistema;
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

}
