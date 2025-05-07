package ar.edu.unlp.info.oo2.patrones_ejercicio_12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	
	Archivo a1, a2, a3;
	Directorio root, dirA, dirB;
	FileSystem fs;
	
	@BeforeEach
	void setUp() throws Exception {
		root = new Directorio("root", LocalDate.now());
        
		a1 = new Archivo("file1.txt", LocalDate.of(2023, 1, 1), 5000);
        a2 = new Archivo("file2.txt", LocalDate.of(2024, 3, 15), 8000);
        a3 = new Archivo("file1.txt", LocalDate.of(2021, 3, 15), 3000);
        
        dirA = new Directorio("docs", LocalDate.of(2023, 6, 1));
        dirB = new Directorio("images", LocalDate.of(2023, 7, 1));
        
        dirA.agregar(a1);
        dirB.agregar(a2);
        dirB.agregar(a3);
        
        root.agregar(dirA);
        root.agregar(dirB);
        
		fs = new FileSystem(root);
	}
	
    @Test
    public void testTamanoTotalOcupado() {
    	Integer resultado = 32 * 3 + 5000 + 8000 + 3000;
    	
        assertEquals(resultado, fs.tamanoTotalOcupado());
    }
    
    @Test
    public void testArchivoMasGrande() {
        assertEquals(a2, fs.archivoMasGrande());
    }
    
    @Test
    public void testArchivoMasNuevo() {
        assertEquals(a2, fs.archivoMasNuevo());
    }
    
    @Test
    public void testBuscar() {
    	assertNull(fs.buscar("sarasa"));
    	assertEquals(dirA, fs.buscar("docs"));
    	assertEquals(a1, fs.buscar("file1.txt"));
    }
    
    @Test
    public void testBuscarTodos() {
    	List<ElementoFileSystem> resultado = new ArrayList<ElementoFileSystem>();
    	
    	assertEquals(resultado, fs.buscarTodos("sarasa"));
    	
    	resultado.add(a1);
    	resultado.add(a3);
    	
    	assertEquals(resultado, fs.buscarTodos("file1.txt"));
    }
    
    @Test
    public void testListadoDeContenido() {
    	String[] strings = {
			"/root",
	    	"/root/docs",
	    	"/root/docs/file1.txt",
	    	"/root/images",
	    	"/root/images/file2.txt",
	    	"/root/images/file1.txt"
    	};
    	
    	String resultado = String.join("\n", strings);
    	
    	assertEquals(resultado, fs.listadoDeContenido());
    }
	
}
