package ar.edu.unlp.info.oo2.frameworks_ejercicio_2_i;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class DatabaseRealAccess implements DatabaseAccess {
	
    private Map<String, List<String>> data;
    private int currentId;
    private Logger logger;

    public DatabaseRealAccess() {
        super();
        this.data = new HashMap<>();
        this.currentId = 3;
        this.data.put("select * from comics where id=1", Arrays.asList("Spiderman", "Marvel"));
        this.data.put("select * from comics where id=2", Arrays.asList("Batman", "DC comics"));
        this.logger = Logger.getLogger(this.getClass().getName());
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
    	logger.info("Se llamo a getSearchResults() con la siguiente query: " + queryString);
        return this.data.getOrDefault(queryString, Collections.emptyList());
    }

    @Override
    public Integer insertNewRow(List<String> rowData) {
        this.data.put("select * from comics where id=" + this.currentId, rowData);
        this.currentId = this.currentId + 1;
        
        logger.warning("Se llamo a insertNewRow con la siguiente rowData: " + rowData);

        return this.currentId - 1;
    }
    
}
