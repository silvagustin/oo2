package ar.edu.unlp.info.oo2.patrones_ejercicio_16b.pipes;

import java.awt.image.BufferedImage;
import ar.edu.unlp.info.oo2.patrones_ejercicio_16b.filtros.*;

public interface ImageFilterPipeInterface {
    
    public BufferedImage filter(BufferedImage image);
    public void addFilter(ImageFilter next);
    public void setNextPipe(ImageFilterPipe newPipe);
    public void addPipeFrom(ImageFilterPipe newPipe, ImageFilterPipe aPipe);
    
}
