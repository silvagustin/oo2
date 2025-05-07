package ar.edu.unlp.info.oo2.patrones_ejercicio_16b.filtros;

import java.awt.image.BufferedImage;

public abstract class AbstractFilter implements ImageFilter{
  abstract public BufferedImage filter(BufferedImage image);
}
