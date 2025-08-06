package parciales.primera_fecha_25_6_2025;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class Excursion {
	
	private String nombre;
	private Date fechaDeInicio;
	private Date fechaDeFin;
	private String puntoDeEncuentro;
	private Double costo;
	private Integer cupoMinimo;
	private Integer cupoMaximo;
	
	private ArrayList<Usuario> usuariosInscriptos;
	private ArrayList<Usuario> usuariosEnEspera;
	
	private Estado estado;
	
	public Excursion(String nombre, Integer cupoMinimo, Integer cupoMaximo) {
		this.usuariosInscriptos = new ArrayList<Usuario>();
		this.usuariosEnEspera = new ArrayList<Usuario>();
		this.estado = new EstadoInicial();
		
		this.nombre = nombre;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
	}
	
	public void addUsuario(Usuario usuario) {
		this.estado.addUsuario(this, usuario);
	}
	
	public void doAddUsuario(Usuario usuario) {
		this.usuariosInscriptos.add(usuario);
	}
	
	public void addUsuarioEnListaDeEspera(Usuario usuario) {
		this.usuariosEnEspera.add(usuario);	
	}
	
	public Boolean cumpleConElMinimo() {
		return this.usuariosInscriptos.size() == this.cupoMinimo;
	}
	
	public Boolean cumpleConElMaximo() {
		return this.usuariosInscriptos.size() == this.cupoMaximo;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Date getFechaDeInicio() {
		return this.fechaDeInicio;
	}
	
	public Date getFechaDeFin() {
		return this.fechaDeFin;
	}
	
	public String getPuntoDeEncuentro() {
		return this.puntoDeEncuentro;
	}
	
	public Double getCosto() {
		return this.costo;
	}
	
	public Integer getCupoMinimo() {
		return this.cupoMinimo;
	}
	
	public Integer getCupoMaximo() {
		return this.cupoMaximo;
	}

	public Integer getCantidadDeUsuariosFaltantesParaAlcanzarElCupoMinimo() {
		return this.cupoMinimo - this.usuariosInscriptos.size();
	}


	public Integer getCantidadDeUsuariosFaltantesParaAlcanzarElCupoMaximo() {
		return this.cupoMaximo - this.cupoMinimo;
	}
	
	public String getEmailsDeUsuariosInscriptos() {
		return this.usuariosInscriptos.stream().map(usuario -> usuario.getEmail()).collect(Collectors.joining());
	}
	
	public Integer getCantidadUsuariosInscriptos() {
		return this.usuariosInscriptos.size();
	}

	public Integer getCantidadUsuariosEnEspera() {
		return this.usuariosEnEspera.size();
	}
	
}
