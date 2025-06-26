package ar.edu.unlp.info.oo2.frameworks_ejercicio_2_ii.impl;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSONFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		return "{ \"message\": \"" + record.getMessage() + "\", \"level\": \"" + record.getLevel() + "\" }\n";
	}
	
}
