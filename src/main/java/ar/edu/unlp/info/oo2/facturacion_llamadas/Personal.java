package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Personal {
	List<Persona> personas = new ArrayList<Persona>();
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
		Persona persona = new Persona(nombreApellido, tipoPersona, numeroTelefono, documento);
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
		persona1.agregarLlamada(llamada);

		return llamada;
	}

	public double calcularMontoTotalLlamadas(Persona persona) {
		double montoTotalLlamadas = 0;

		if (existeUsuario(persona)) {
			for (Llamada llamada : persona.getLlamadas()) {
		 		montoTotalLlamadas += calcularMontoLlamada(llamada, persona);
		 	}
		}

		return montoTotalLlamadas;
	}

	public double calcularMontoLlamada(Llamada llamada, Persona persona) {
		double montoLlamada = 0;

		montoLlamada += llamada.calcularMontoSegunTipoDeLlamada();
		montoLlamada -= persona.calcularDescuentoSegunTipoPersona(montoLlamada);

		return montoLlamada;
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persona persona) {
		return personas.contains(persona);
	}

}
