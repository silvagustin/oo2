package p1.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem {
	
	private List<FileSystem> archivos = new ArrayList<>();
	
	/**
	 *	Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
	 */
    public Directorio(String nombre, LocalDate fecha) {
    	this.nombre = nombre;
    	this.fecha = fecha;
    	this.tamano = 32;
    }

    /**
	 * 	Retorna el espacio total ocupado, incluyendo su contenido.
	 */
    public int tamanoTotalOcupado() {
    	return this.tamano + this.archivos.stream()
										   .mapToInt(archivo -> archivo.tamanoTotalOcupado())
										   .sum();
    }

   	/**
	 * 	Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	 * 	filesystem contenido por directorio receptor
	 */
    public Archivo archivoMasGrande() {
    	Archivo archivo = null;
    	return archivo;
    	
    	// return this.archivos.stream()
		//						.max(Comparator.comparingInt(FileSystem::tamanoTotalOcupado))
		//						.get();
    }
    
	/**
	 * 	Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	 * 	del filesystem contenido por directorio receptor.
	 */
    public Archivo archivoMasNuevo() {
    	Archivo archivo = null;
    	return archivo;
    }
    
    public void agregar(FileSystem archivo) {
    	archivos.add(archivo);
    }
    
}
