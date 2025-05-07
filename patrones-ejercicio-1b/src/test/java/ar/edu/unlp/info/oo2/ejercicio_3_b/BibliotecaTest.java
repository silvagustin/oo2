package ar.edu.unlp.info.oo2.ejercicio_3_b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	private Biblioteca biblioteca;
	
	@BeforeEach
	public void setUp() {
		biblioteca = new Biblioteca();
		
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	
	@Test
	public void testExportarSocios() throws ParseException {
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
		
		JSONParser parser = new JSONParser();

		assertEquals(parser.parse(resultado), parser.parse(biblioteca.exportarSocios()));
	}
	
}
