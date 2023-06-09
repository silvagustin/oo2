package p1.ejercicio2b;

import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class VoorheesExporter {
	private JSONArray sociosJSON;

	@SuppressWarnings("unchecked")
	private JSONObject exportar(Socio socio) {
		JSONObject socioJSON = new JSONObject();
		
		socioJSON.put("nombre", socio.getNombre());
		socioJSON.put("email", socio.getEmail());
		socioJSON.put("legajo", socio.getLegajo());
		
		return socioJSON;
	}

	@SuppressWarnings("unchecked")
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		
		sociosJSON = new JSONArray();
		
		socios.forEach(socio -> sociosJSON.add(exportar(socio)));
		
		return sociosJSON.toJSONString();
	}
}

