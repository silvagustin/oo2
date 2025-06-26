package ar.edu.unlp.info.oo2.frameworks_ejercicio_2_ii.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.info.oo2.frameworks_ejercicio_2_ii.ui.WallPostUI;

public class Ejercicio1Application {

	
	public static void main(String[] args) throws SecurityException, IOException {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
