package main.java.com.gemini.training;

import org.apache.log4j.Logger;

public class Log4j_Example {

	final static Logger logger = Logger.getLogger(Log4j_Example.class);
	public static void main(String a[]){
		logger.info("Hiiii");
		System.out.println(logger.getAllAppenders());
	}
}
