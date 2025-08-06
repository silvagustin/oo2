package parciales.primera_fecha_25_6_2025;

public class EstadoDefinitivo extends Estado {

	@Override
	public void addUsuario(Excursion excursion, Usuario usuario) {
		excursion.addUsuarioEnListaDeEspera(usuario);
	}

	@Override
	public String getInformacion(Excursion excursion) {
		return "Nombre: " + excursion.getNombre() + "\n" +
			   "Costo: " + excursion.getCosto() + "\n" +
			   "Fecha de inicio: " + excursion.getFechaDeInicio() + "\n" +
			   "Fecha de fin: " + excursion.getFechaDeFin() + "\n" +
			   "Punto de encuentro: " + excursion.getPuntoDeEncuentro() + "\n";
	}
	
}
