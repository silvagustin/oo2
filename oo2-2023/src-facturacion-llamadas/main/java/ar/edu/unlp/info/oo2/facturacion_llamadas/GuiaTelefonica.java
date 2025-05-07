package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	private SortedSet<String> guia = new TreeSet<String>();

	public boolean agregarNumeroTelefono(String numeroTelefono) {
		return !guia.contains(numeroTelefono) && guia.add(numeroTelefono);
	}

	public void eliminarNumeroTelefono(String numeroTelefono) {
		guia.remove(numeroTelefono);
	}

	public String getUltimoNumeroTelefono() {
		return guia.last();
	}

}
