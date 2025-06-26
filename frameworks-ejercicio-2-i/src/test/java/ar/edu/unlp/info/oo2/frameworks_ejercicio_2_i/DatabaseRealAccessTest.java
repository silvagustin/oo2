package ar.edu.unlp.info.oo2.frameworks_ejercicio_2_i;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
	
    private DatabaseAccess database;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseProxyAccess();
    }

    @Test
    void testGetSearchResults() {
    	// logged_in == false
    	assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=1"));
        
        // User logs in
        ((DatabaseProxyAccess) database).login("password");
        
    	// logged_in == true
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
    	// logged_in == false
    	assertEquals(0, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=3"));
        
        ((DatabaseProxyAccess) database).login("password");

    	// logged_in == true
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    
}
