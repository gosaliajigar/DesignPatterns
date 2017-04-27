package creational.factory.design.pattern.implementations;

import creational.factory.design.pattern.interfaces.Display;

/**
 * Display Implementation to deal with XML format file
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class XMLFile implements Display {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.factory.design.pattern.Display#load(java.lang.String)
	 */
	public void load(String xmlfile) {
		System.out.println("Load from an xml file");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.factory.design.pattern.Display#formatConsistency()
	 */
	public void formatConsistency() {
		System.out.println("XML file format changed");
	}
}
