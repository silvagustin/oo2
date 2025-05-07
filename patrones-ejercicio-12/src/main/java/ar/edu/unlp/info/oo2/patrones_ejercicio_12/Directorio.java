package ar.edu.unlp.info.oo2.patrones_ejercicio_12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends ElementoFileSystem {
	
	private List<ElementoFileSystem> elementosFS;
	
	public Directorio(String nombre, LocalDate fechaDeCreacion) {
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
		this.elementosFS = new ArrayList<ElementoFileSystem>();
	}

	@Override
	public Integer tamano() {
		return elementosFS.stream()
						  .mapToInt(elementoFS -> elementoFS.tamano())
						  .sum() + 32;
	}
	
	public List<ElementoFileSystem> getElementosFS() {
		return this.elementosFS;
	}
	
	public void agregar(ElementoFileSystem elementoFS) {
		this.elementosFS.add(elementoFS);
	}
	
	@Override
    public List<String> listadoDeContenido(String path) {
        List<String> resultado = new ArrayList<>();
        String actualPath = getPath(path);
        resultado.add(actualPath);
        
        for (ElementoFileSystem elementoFS: elementosFS) {
            resultado.addAll(elementoFS.listadoDeContenido(actualPath));
        }
        
        return resultado;
    }
	
	@Override
	public String getPath(String padre) {
       return padre + "/" + nombre;
	}

	@Override
	public ElementoFileSystem buscar(String nombre) {
		if (this.nombre == nombre) {
			return this;
		} 
		
		for (ElementoFileSystem elementoFS: elementosFS) {
			ElementoFileSystem elementoFSEncontrado = elementoFS.buscar(nombre);
			
			if (elementoFSEncontrado != null) {
				return elementoFSEncontrado;
			}
		}	
		
		return null;
	}

	@Override
	public List<ElementoFileSystem> buscarTodos(String nombre) {
		List<ElementoFileSystem> elementosFSEncontrados = new ArrayList<>();
		
		if (this.nombre == nombre) {
			elementosFSEncontrados.add(this);
		}
		
		   
		for (ElementoFileSystem elementoFS: elementosFS) {
			elementosFSEncontrados.addAll(elementoFS.buscarTodos(nombre));
		}
		
		return elementosFSEncontrados;
	}

}
