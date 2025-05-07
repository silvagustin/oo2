package ar.edu.unlp.info.oo2.patrones_ejercicio_12;

import java.util.Comparator;
import java.util.List;

public class FileSystem {
	
	private Directorio directorioRaiz;
	
	public FileSystem(Directorio directorio) {
		this.directorioRaiz = directorio;
	}

	/**
	 * Retorna el espacio total ocupado, incluyendo todo su contenido.
	 */
	public int tamanoTotalOcupado() {
		return directorioRaiz.tamano();
	}
	
	/**
	 * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del filesystem.
	 */
	public Archivo archivoMasGrande() {
		Comparator<Archivo> comparador = (a1, a2) -> Integer.compare(a1.tamano(), a2.tamano());
		
		return buscarArchivo(null, directorioRaiz, comparador);
	}
	
	/**
	 * Retorna el archivo con fecha de creacion mas reciente en cualquier nivel del filesystem.
	 */
	public Archivo archivoMasNuevo() {
		Comparator<Archivo> comparador = (a1, a2) -> a1.getFechaDeCreacion().compareTo(a2.getFechaDeCreacion());
		
		
		return buscarArchivo(null, directorioRaiz, comparador);
	}
	
	/**
	 * Retorna el primer elemento con el nombre solicitado contenido en cualquier nivel del filesystem.
	 */
	public ElementoFileSystem buscar(String nombre) {
		return directorioRaiz.buscar(nombre);
	}
	
	/**
	 * Retorna la lista con los elementos que coinciden con el nombre solicitado contenido en cualquier nivel del filesystem.
	 */
	public List<ElementoFileSystem> buscarTodos(String nombre) {
		return directorioRaiz.buscarTodos(nombre);
	}
	
	/**
	 * Retorna un String con los nombres de los elementos contenidos en todos los
	 * niveles del filesystem. De cada elemento debe retornar el path completo
	 * (similar al comando pwd de linux) siguiendo el modelo presentado a
	 * continuacion
	 * 
	 * \/Directorio A
	 * \/Directorio A/Directorio A.1
	 * \/Directorio A/Directorio A.1/Directorio A.1.1
	 * \/Directorio A/Directorio A.1/Directorio A.1.2
	 * \/Directorio A/Directorio A.2
	 * \/Directorio B
	 * 
	 */
	public String listadoDeContenido() {
        return String.join("\n", directorioRaiz.listadoDeContenido(""));
	}
	
	private Archivo buscarArchivo(Archivo archivoComparable, ElementoFileSystem elementoFS, Comparator<Archivo> comparador) {
		if (elementoFS instanceof Archivo) {
			if (archivoComparable == null || comparador.compare((Archivo) elementoFS, archivoComparable) > 0) {
				archivoComparable = (Archivo) elementoFS;
			}
		} else {
			for(ElementoFileSystem eFS: ((Directorio) elementoFS).getElementosFS()) {
				archivoComparable = buscarArchivo(archivoComparable, eFS, comparador);
			}
		}
		
		return archivoComparable;
	}
	
}
