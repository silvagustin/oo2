package p1.ejercicio2b;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	private Biblioteca biblioteca;
	
	@BeforeEach
	void setup() {
		biblioteca = new Biblioteca();
		
		Socio socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		Socio socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
		
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);
	}
	
	@Test
	public void testExportarSocios() throws ParseException {
		/*
		 * Para corroborar que tengo 2 JSON iguales, tengo que parsearlo de String a JSON.
		 * Para ello, uso JSONParser().
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
		
		JSONParser parser = new JSONParser();
				
		assertEquals(parser.parse(resultado), parser.parse(biblioteca.exportarSocios()));
	}
}
