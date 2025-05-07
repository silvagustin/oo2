package ar.edu.unlp.info.oo2.ejercicio_3_b;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class VoorheesExporter {

	private JSONObject exportar(Socio socio) {
		JSONObject obj = new JSONObject();

		obj.put("nombre", socio.getNombre());
		obj.put("email", socio.getEmail());
		obj.put("legajo", socio.getLegajo());
		
		return obj;
	}

	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		
		JSONArray sociosJSON = new JSONArray();
		
		socios.forEach(socio -> {
			sociosJSON.add(this.exportar(socio));
		});

		return sociosJSON.toJSONString();
	}
}
