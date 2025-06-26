package ar.edu.unlp.info.oo2.frameworks_ejercicio_2_i;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DatabaseProxyAccess implements DatabaseAccess {
	
	private Boolean logged_in;
	private DatabaseAccess db;
	
	public DatabaseProxyAccess() {
		this.logged_in = false;
		this.db = new DatabaseRealAccess();
	}

	@Override
	public Integer insertNewRow(List<String> rowData) {
		if (logged_in) {
			return this.db.insertNewRow(rowData);
		} else {
			return 0;
		}
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (logged_in) {
			return this.db.getSearchResults(queryString);
		} else {
			return Collections.emptyList();
		}
	}
    
    public void login(String password) {
    	if (password == "password") {
    		this.logged_in = true;
    	}
    }

}