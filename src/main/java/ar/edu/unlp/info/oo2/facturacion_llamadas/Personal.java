package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Personal {
	static double descuentoJur = 0.15;
	static double descuentoFis = 0;

	List<Persona> personas = new ArrayList<Persona>();
	List<Llamada> llamadas = new ArrayList<Llamada>();
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
		personas.add(persona);

		return persona;
	}

	public boolean eliminarUsuario(Persona persona) {
		boolean fueBorrado = this.personas.remove(persona);

		if (fueBorrado) {
			this.guiaTelefonica.agregarNumeroTelefono(persona.getNumeroTelefono());
		}

		return fueBorrado;
	}

	public Llamada registrarLlamada(Persona persona1, Persona persona2, String tipoLlamada, int duracion) {
		Llamada llamada = new Llamada(tipoLlamada, persona1.getNumeroTelefono(), persona2.getNumeroTelefono(), duracion);

		llamadas.add(llamada);
		persona1.getLlamadas().add(llamada);

		return llamada;
	}

	public double calcularMontoTotalLlamadas(Persona p) {
		double c = 0;
		Persona aux = null;
		for (Persona pp : personas) {
			if (pp.getNumeroTelefono() == p.getNumeroTelefono()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.getLlamadas()) {
				double auxc = 0;
				if (l.getTipoDeLlamada() == "nacional") {
					auxc += l.getDuracion() *3 + (l.getDuracion()*3*0.21);
				} else if (l.getTipoDeLlamada() == "internacional") {
					auxc += l.getDuracion() *200 + (l.getDuracion()*200*0.21);
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
		return personas.size();
	}

	public boolean existeUsuario(Persona persona) {
		return personas.contains(persona);
	}

}
