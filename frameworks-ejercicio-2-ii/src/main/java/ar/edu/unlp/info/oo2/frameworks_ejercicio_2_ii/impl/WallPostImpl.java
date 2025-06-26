package ar.edu.unlp.info.oo2.frameworks_ejercicio_2_ii.impl;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;
	private static final Logger logger = Logger.getLogger(WallPostImpl.class.getName());

	public WallPostImpl() throws SecurityException, IOException {
		this.text = "Undefined post";
		setupLogger();
	}

	public WallPostImpl(String text, int likes, boolean isFeaured) throws SecurityException, IOException {
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeaured;
		setupLogger();
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;

	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		this.likes = this.likes + 1;
		
		if (this.getLikes() == 10) {
			logger.warning("Se han llegado a los 10 likes!");
		}

	}

	@Override
	public void dislike() {
		if (likes > 0) {
			this.likes = this.likes - 1;
			
			if (this.getLikes() == 0) {
				logger.warning("Se han llegado a los 0 likes!");
			}
		}

	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}
	
	private void setupLogger() throws SecurityException, IOException {
		// FileHandler fileHandler = new FileHandler("logfile.txt");
		
		// TodoEnMayusculasFormatter todoEnMayusculasFormatter = new TodoEnMayusculasFormatter();
		// fileHandler.setFormatter(todoEnMayusculasFormatter);
		
		// logger.addHandler(fileHandler);
		
		
		// Para usar el Logger de consola y no generar archivos ".txt"
		
		ConsoleHandler consoleHandler1 = new ConsoleHandler();
		ConsoleHandler consoleHandler2 = new ConsoleHandler();
		
		TodoEnMayusculasFormatter todoEnMayusculasFormatter = new TodoEnMayusculasFormatter();
		consoleHandler1.setFormatter(todoEnMayusculasFormatter);
		
		JSONFormatter jsonFormatter = new JSONFormatter();
		consoleHandler2.setFormatter(jsonFormatter);
		
		// logger.addHandler(consoleHandler1);
		logger.addHandler(consoleHandler2);
	}

}
