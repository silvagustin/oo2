package parciales.primera_fecha_25_6_2025;

public class EstadoProvisorio extends Estado {

	@Override
	public void addUsuario(Excursion excursion, Usuario usuario) {
		excursion.doAddUsuario(usuario);
		
		if (excursion.cumpleConElMaximo()) {
			excursion.setEstado(new EstadoDefinitivo());
		}
	}

	@Override
	public String getInformacion(Excursion excursion) {
		return "Nombre: " + excursion.getNombre() + "\n" +
			   "Costo: " + excursion.getCosto() + "\n" +
			   "Fecha de inicio: " + excursion.getFechaDeInicio() + "\n" +
			   "Fecha de fin: " + excursion.getFechaDeFin() + "\n" +
			   "Punto de encuentro: " + excursion.getPuntoDeEncuentro() + "\n" +
			   "Emails: " + excursion.getEmailsDeUsuariosInscriptos() + "\n" +
			   "Cantidad de usuarios faltantes para alcanzar el cupo maximo: " + excursion.getCantidadDeUsuariosFaltantesParaAlcanzarElCupoMaximo() + "\n";
	}
	
}
