package ar.edu.unlp.info.oo2.ejercicio_1;

public class Tweet {

	private String text;
	
	public Tweet(String text) {
		this.text = text;
	}
	
	public Boolean isValid() {
		Integer length = this.text.length();
		
		return length > 0 && length <= 280; 
	}
	
}
