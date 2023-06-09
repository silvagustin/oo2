package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	private Biblioteca biblioteca;
	
	@BeforeEach
	void setUp() {
		biblioteca = new Biblioteca();
		
		Socio socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		Socio socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
		
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);
	}
	
	@Test
	public void testExportarSocios() {
		/*
		 * No estaria del todo bien ya que comparamos Strings,
		 * y lo que tenemos que ver es si es un JSON valido.
		 */
		
		String resultado = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]";
				
		assertEquals(resultado, biblioteca.exportarSocios());
	}
}
