package ar.edu.unlp.info.oo2.patrones_ejercicio_3;

public class VideoStreamAdapter extends Media {
	private VideoStream videoStream;
	
	@Override
	public void play() {
		videoStream.reproduce();
	}
}
