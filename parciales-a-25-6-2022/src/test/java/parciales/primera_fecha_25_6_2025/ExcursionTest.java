package parciales.primera_fecha_25_6_2025;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {

	private Excursion excursion;
	private Usuario usuarioUno, usuarioDos, usuarioTres;
	
	@BeforeEach
	public void setUp() {
		excursion = new Excursion("Dos dias en kayak bajando el Parana", 1, 2);
		
		usuarioUno = new Usuario("Usuario", "Uno", "usuario-uno@example.com");
		usuarioDos = new Usuario("Usuario", "Dos", "usuario-dos@example.com");
		
		excursion.addUsuario(usuarioUno);
		excursion.addUsuario(usuarioDos);
		
		usuarioTres = new Usuario("Usuario", "Tres", "usuario-tres@example.com");
	}
	
	@Test
	public void testInscribirUsuarioCuandoElCupoLlegoAlMaximo() {
		excursion.addUsuario(usuarioTres);
		
		assertEquals(2, excursion.getCantidadUsuariosInscriptos());
		assertEquals(1, excursion.getCantidadUsuariosEnEspera());
	}
	
}
