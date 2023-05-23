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

	public Persona registrarUsuario(String data, String nombre, String t) {
		Persona var = new Persona();
		if (t.equals("fisica")) {
			var.setNya(nombre);
			String tel = guiaTelefonica.getUltimoNumeroTelefono();
			guiaTelefonica.eliminarNumeroTelefono(tel);
			var.setT(t);
			var.setTel(tel);
			var.setDoc(data);
		}
		else if (t.equals("juridica")) {
			String tel = guiaTelefonica.getUltimoNumeroTelefono();
			guiaTelefonica.eliminarNumeroTelefono(tel);
			var.nya =nombre;
			var.t =t;
			var.tel = tel;
			var.cuit =data;
		}
		var.sis = this;
		lista1.add(var);
		return var;
	}

	public boolean eliminarUsuario(Persona p) {
		List<Persona> l = p.sis.lista1.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < lista1.size()) {
			this.lista1 = l;
			this.guiaTelefonica.agregarNumeroTelefono(p.getTel());
			borre = true;
		}
		return borre;
	}

	public Llamada registrarLlamada(Persona q, Persona q2, String t, int d) {
		Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.tel);
		x.setRemitente(q2.getTel());
		x.dur= d;
		lista2.add(x);
		q.lista1.add(x);
		return x;
	}

	public double calcularMontoTotalLlamadas(Persona p) {
		double c = 0;
		Persona aux = null;
		for (Persona pp : lista1) {
			if (pp.tel == p.getTel()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.lista1) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.dur *3 + (l.dur*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.dur *200 + (l.dur*200*0.21);
				}

				if (aux.t == "fisica") {
					auxc -= auxc*descuentoFis;
				} else if(aux.t == "juridica") {
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
