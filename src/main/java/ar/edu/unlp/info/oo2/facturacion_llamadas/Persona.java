package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	public List<Llamada> lista1 = new ArrayList<Llamada>();
	public String t;
	public String nya;
	public String tel;
	public String cuit;
	public String doc;
	public Personal sis;

	public Persona(String nombreApellido, String tipoPersona, String numeroTelefono, String documento, Personal sistema) {
		this.nya = nombreApellido;
		this.t   = tipoPersona;
		this.tel = numeroTelefono;
		this.doc = documento;
		this.sis = sistema;
	}

	public List<Llamada> getLista1() {
		return lista1;
	}

	public void setLista1(List<Llamada> lista1) {
		this.lista1 = lista1;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getNya() {
		return nya;
	}

	public void setNya(String nya) {
		this.nya = nya;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

}
