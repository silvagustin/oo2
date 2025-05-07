package ar.edu.unlp.info.oo2.patrones_ejercicio_13;

public class Sandwich {

	private Componente pan, aderezo, principal, adicional;
	
	public void setPan(Componente pan) {
		this.pan = pan;
	}

	public void setAderezo(Componente aderezo) {
		this.aderezo = aderezo;
	}
	
	public void setPrincipal(Componente principal) {
		this.principal = principal;
	}

	public void setAdicional(Componente adicional) {
		this.adicional = adicional;
	}
	
	public Integer getPrecio() {
		Integer total = 0;
		
		total += (pan != null) ? pan.getPrecio() : 0;
		total += (aderezo != null) ? aderezo.getPrecio() : 0;
		total += (principal != null) ? principal.getPrecio() : 0;
		total += (adicional != null) ? adicional.getPrecio() : 0;
		
		return total;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(pan + "\n");
		stringBuilder.append(aderezo + "\n");
		stringBuilder.append(principal + "\n");
		stringBuilder.append(adicional + "\n");
		stringBuilder.append("Total: $" + getPrecio() + "\n");
		
		return stringBuilder.toString();
	}
	
}
