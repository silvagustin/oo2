package ar.edu.unlp.info.oo2.patrones_ejercicio_12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo extends ElementoFileSystem {
	
	private Integer tamano;
	
	public Archivo(String nombre, LocalDate fechaDeCreacion, Integer tamano) {
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
		this.tamano = tamano;
	}

	@Override
	public Integer tamano() {
		return this.tamano;
	}
	
	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}
	
	@Override
	public String getPath(String padre) {
		return padre + "/" + nombre;
	}
	
	@Override
    public List<String> listadoDeContenido(String path) {
    	List<String> resultado = new ArrayList<>();
        resultado.add(getPath(path));
        return resultado;
    }

	@Override
	public ElementoFileSystem buscar(String nombre) {
		if (this.nombre == nombre) {
			return this;
		} else {
			return null;
		}
	}

	@Override
	public List<ElementoFileSystem> buscarTodos(String nombre) {
		List<ElementoFileSystem> resultado = new ArrayList<ElementoFileSystem>();
		
		if (this.nombre == nombre) {	
			resultado.add(this);
		}
		
		return resultado;
	}

}
