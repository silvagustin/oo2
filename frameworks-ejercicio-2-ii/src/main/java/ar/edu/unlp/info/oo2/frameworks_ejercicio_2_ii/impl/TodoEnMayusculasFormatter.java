package ar.edu.unlp.info.oo2.frameworks_ejercicio_2_ii.impl;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class TodoEnMayusculasFormatter extends SimpleFormatter {

	@Override
	public String format(LogRecord record) {
		return super.format(record).toUpperCase();
	}
	
}
