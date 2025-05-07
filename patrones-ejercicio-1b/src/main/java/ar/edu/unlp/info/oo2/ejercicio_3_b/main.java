package ar.edu.unlp.info.oo2.ejercicio_3_b;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Socio socio = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		
		// biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		
		// Creamos el JSONObject
		JSONObject obj = new JSONObject();

		obj.put("nombre", socio.getNombre());
		obj.put("email", socio.getEmail());
		obj.put("legajo", socio.getLegajo());
		
		// Agregamos el JSONObject a un JSONArray
		JSONArray socios = new JSONArray();
		
		socios.add(obj);
		
		// Resultado
		System.out.println(socios.toJSONString());
		
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		
		System.out.println(biblioteca.exportarSocios());

	}

}
