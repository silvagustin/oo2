package ar.edu.unlp.info.oo2.patrones_ejercicio_6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {

	private String nombre;
	private Date fechaDeInicio;
	private Date fechaDeFin;
	private String puntoDeEncuentro;
	private Double costo;
	private Integer cupoMinimo;
	private Integer cupoMaximo;
	
	private List<Usuario> usuariosInscriptos;
	private List<Usuario> usuariosEnEspera;
	
	private EstadoCupo estadoCupoActual;
	
	public Excursion(String nombre, Date fechaDeInicio, Date fechaDeFin, String puntoDeEncuentro, Double costo, Integer cupoMinimo, Integer cupoMaximo) {
		this.nombre = nombre;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		
		this.usuariosInscriptos = new ArrayList<Usuario>();
		this.usuariosEnEspera = new ArrayList<Usuario>();
		
		this.estadoCupoActual = new EstadoCupoIncompleto();
	}
	
	public String obtenerInformacion() {
		return estadoCupoActual.obtenerInformacion(this);
	}
	
	public void inscribir(Usuario unUsuario) {
		estadoCupoActual.inscribir(this, unUsuario);
	}
	
	public Integer getCantidadDeUsuariosFaltantesParaElCupoMinimo() {
		return cupoMinimo - usuariosInscriptos.size();
	}
	
	public Integer getCantidadDeUsuariosFaltantesParaElCupoMaximo() {
		return cupoMaximo - usuariosInscriptos.size();
	}
	
	public List<String> getUsuariosInscriptosEmails() {
		return usuariosInscriptos.stream()
								 .map(usuarioInscripto -> usuarioInscripto.getEmail())
								 .collect(Collectors.toList());
	}
	
	public void actualizarListaDeInscriptos(Usuario unUsuario) {
		usuariosInscriptos.add(unUsuario);
	}
	
	public void actualizarListaEnEspera(Usuario unUsuario) {
		usuariosEnEspera.add(unUsuario);
	}
	
	// Getters
	
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
	
}
