package com.factory.design.pattern.implementations;

import com.factory.design.pattern.interfaces.Display;

/**
 * Display Implementation to deal with binary format file
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class DBFile implements Display {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.factory.design.pattern.Display#load(java.lang.String)
	 */
	public void load(String dbfile) {
		System.out.println("Load from a db file");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.factory.design.pattern.Display#formatConsistency()
	 */
	public void formatConsistency() {
		System.out.println("DB file format changed");
	}
}