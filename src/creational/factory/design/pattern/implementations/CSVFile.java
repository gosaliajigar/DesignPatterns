package creational.factory.design.pattern.implementations;

import creational.factory.design.pattern.interfaces.Display;

/**
 * Display Implementation to deal with plain text file
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class CSVFile implements Display {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.factory.design.pattern.Display#load(java.lang.String)
	 */
	public void load(String textfile) {
		System.out.println("Load from a txt file");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.factory.design.pattern.Display#formatConsistency()
	 */
	public void formatConsistency() {
		System.out.println("Text file format changed");
	}
}