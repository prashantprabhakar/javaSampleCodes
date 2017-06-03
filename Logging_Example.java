package main.java.com.gemini.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging_Example {
	
	private final static Logger LOGGER = Logger.getLogger(Logging_Example.class.getName()); 
	
	public static void main(String args[]) throws SecurityException, IOException{
		FileHandler logFileHandler = new FileHandler("src/mylog.log", false);
		logFileHandler.setLevel(Level.ALL);
		logFileHandler.setFormatter(new SimpleFormatter());
		LOGGER.addHandler(logFileHandler);
		
		LOGGER.setLevel(Level.SEVERE);
		safecodeToPrintList();
	}

	private static void safecodeToPrintList() throws SecurityException, IOException {
		List<String> l = new ArrayList<String>();
		l.add("Ritika");
		l.add("2");
		LOGGER.info("List populated");
		for(int i = 0; i < l.size();i++){
			System.out.println(l.get(i));
		}
		
		
		
		LOGGER.info("List printed");
		LOGGER.log(Level.SEVERE, "Sample error log");
	}
}
