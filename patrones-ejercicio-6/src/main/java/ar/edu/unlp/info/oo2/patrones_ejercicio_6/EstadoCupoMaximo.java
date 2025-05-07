package ar.edu.unlp.info.oo2.patrones_ejercicio_6;

public class EstadoCupoMaximo extends EstadoCupo {

	@Override
	public String obtenerInformacion(Excursion excursion) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Nombre de la excursion: " + excursion.getNombre())
			   .append("Costo: " + excursion.getCosto().toString())
			   .append("Fecha de inicio: " + excursion.getFechaDeInicio().toString())
			   .append("Fecha de fin: " + excursion.getFechaDeFin().toString())
			   .append("Punto de encuentro: " + excursion.getPuntoDeEncuentro());
		
		return builder.toString();
	}

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) {
		excursion.actualizarListaEnEspera(usuario);
	}

}
