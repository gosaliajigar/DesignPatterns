package com.singleton.design.flagpattern;

/**
 * @author "Jigar Gosalia"
 *
 */
public class SingletonFlagPattern {

	/**
	 * 
	 */
	private static boolean hasInstance = false;

	/**
	 * 
	 */
	private static SingletonFlagPattern instance = null;

	/**
	 * 
	 */
	private SingletonFlagPattern() {
		System.out.println("Instantiated SingletonFlagPattern ... ");
	}

	/**
	 * @return
	 */
	public static SingletonFlagPattern getInstance() {
		if (!hasInstance) {
			instance = new SingletonFlagPattern();
			hasInstance = true;
		} else {
			System.out.println("Returning Existing SingletonFlagPattern ... ");
		}
		return instance;
	}
}
