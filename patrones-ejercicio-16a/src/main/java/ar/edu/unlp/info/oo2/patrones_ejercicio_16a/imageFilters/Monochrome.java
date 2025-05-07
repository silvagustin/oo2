package ar.edu.unlp.info.oo2.patrones_ejercicio_16a.imageFilters;

import java.awt.image.BufferedImage;

public class Monochrome extends Filter {

	@Override
	public BufferedImage filter(BufferedImage image) {
		for (int x = 0; x < image.getWidth(); x++) {
		      for (int y = 0; y < image.getHeight(); y++) {
		    	  int pixel = image.getRGB(x, y);
		    	  int alpha = (pixel >> 24) & 0xff;
		    	  int red = (pixel >> 16) & 0xff;
		    	  int green = (pixel >> 8) & 0xff;
		    	  int blue = pixel & 0xff;

		    	  int avg = (red + green + blue) / 3;
		    	  pixel = (alpha << 24) | (avg << 16) | (avg << 8) | avg;
		    	  image.setRGB(x, y, pixel);  
		      }
		}
		      
		
		return image;
	}

}
