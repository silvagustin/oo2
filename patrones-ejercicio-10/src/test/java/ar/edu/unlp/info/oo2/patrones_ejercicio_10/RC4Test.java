package ar.edu.unlp.info.oo2.patrones_ejercicio_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author gperez
 *
 */
class RC4Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		RC4 rc4 = new RC4();
		
		String key = "clave";
		String plaintext = "Hola mundo!";
        assertEquals(plaintext, rc4.desencriptar(rc4.encriptar(plaintext, key), key));
	}

}
