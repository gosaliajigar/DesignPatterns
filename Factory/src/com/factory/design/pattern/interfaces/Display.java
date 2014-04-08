package com.factory.design.pattern.interfaces;

/**
 * Display Interface
 * 
 * @author "Jigar Gosalia"
 * 
 */
public interface Display {

	/**
	 * load a file
	 * 
	 * @param fileName
	 */
	public void load(String fileName);

	/**
	 * parse the file and make a consistent data type
	 */
	public void formatConsistency();
}