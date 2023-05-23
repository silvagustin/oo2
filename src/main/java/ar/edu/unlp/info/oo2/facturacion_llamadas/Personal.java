package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Personal {
	static double descuentoJur = 0.15;
	static double descuentoFis = 0;

	List<Persona> lista1 = new ArrayList<Persona>();
	List<Llamada> lista2 = new ArrayList<Llamada>();
	GuiaTelefonica guiaTelefonica;

	public Personal(GuiaTelefonica guiaTelefonica) {
		this.guiaTelefonica = guiaTelefonica;
	}

	public Personal() {
		this.guiaTelefonica = new GuiaTelefonica();
	}

	public Persona registrarUsuario(String documento, String nombreApellido, String tipoPersona) {
		String numeroTelefono = guiaTelefonica.getUltimoNumeroTelefono();
		guiaTelefonica.eliminarNumeroTelefono(numeroTelefono);
		Persona persona = new Persona(nombreApellido, tipoPersona, numeroTelefono, documento, this);
		lista1.add(persona);

		return persona;
	}

	public boolean eliminarUsuario(Persona p) {
		List<Persona> l = p.getSistema().lista1.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < lista1.size()) {
			this.lista1 = l;
			this.guiaTelefonica.agregarNumeroTelefono(p.getNumeroTelefono());
			borre = true;
		}
		return borre;
	}

	public Llamada registrarLlamada(Persona q, Persona q2, String t, int d) {
		Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.getNumeroTelefono());
		x.setRemitente(q2.getNumeroTelefono());
		x.dur= d;
		lista2.add(x);
		q.getLlamadas().add(x);
		return x;
	}

	public double calcularMontoTotalLlamadas(Persona p) {
		double c = 0;
		Persona aux = null;
		for (Persona pp : lista1) {
			if (pp.getNumeroTelefono() == p.getNumeroTelefono()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.getLlamadas()) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.dur *3 + (l.dur*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.dur *200 + (l.dur*200*0.21);
				}

				if (aux.getTipoPersona() == "fisica") {
					auxc -= auxc*descuentoFis;
				} else if(aux.getTipoPersona() == "juridica") {
					auxc -= auxc*descuentoJur;
				}
				c += auxc;
			}
		}
		return c;
	}

	public int cantidadDeUsuarios() {
		return lista1.size();
	}

	public boolean existeUsuario(Persona persona) {
		return lista1.contains(persona);
	}

}
