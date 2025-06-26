package ar.edu.unlp.info.oo2.patrones_ejercicio_17;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	
   /**
    * Realiza la inserción de nueva información en la base de datos y 
    * retorna el id que recibe la nueva inserción
    *
    * @param rowData
    * @return
    */
	public Integer insertNewRow(List<String> rowData);
	
	/**
    * Retorna una colección de acuerdo al texto que posee "queryString"
    *
    * @param queryString
    * @return
    */
	public Collection<String> getSearchResults(String queryString);
	
}
