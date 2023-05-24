package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
	private String tipoDeLlamada;
	private String emisor;
	private String remitente;
	private int duracion;

	public Llamada(String tipoDeLlamada, String emisor, String remitente, int duracion) {
		this.tipoDeLlamada = tipoDeLlamada;
		this.emisor        = emisor;
		this.remitente     = remitente;
		this.duracion      = duracion;
	}

	public String getTipoDeLlamada() {
		return tipoDeLlamada;
	}

	public void setTipoDeLlamada(String tipoDeLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
	}

	public void setEmisor(String q) {
		emisor = q;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}
