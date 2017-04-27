package creational.factory.design.pattern.implementations;

import creational.factory.design.pattern.interfaces.Display;

/**
 * Display Implementation to deal with plain text file
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class CSVFile implements Display {

	/* (non-Javadoc)
	 * @see creational.factory.design.pattern.interfaces.Display#load(java.lang.String)
	 */
	public void load(String textfile) {
		System.out.println("Load from a txt file");
	}

	/* (non-Javadoc)
	 * @see creational.factory.design.pattern.interfaces.Display#formatConsistency()
	 */
	public void formatConsistency() {
		System.out.println("Text file format changed");
	}
}