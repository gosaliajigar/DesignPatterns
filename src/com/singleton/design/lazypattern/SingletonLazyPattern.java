package com.singleton.design.lazypattern;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonLazyPattern {

	/**
	 * 
	 */
	private static SingletonLazyPattern instance = null;

	/**
	 * 
	 */
	private SingletonLazyPattern() {
		System.out.println("Instantiated SingletonLazyPattern ... ");
	}

	/**
	 * @return
	 */
	public static SingletonLazyPattern getInstance() {
		if (instance == null) {
			instance = new SingletonLazyPattern();
		} else {
			System.out.println("Returning Existing SingletonLazyPattern ... ");
		}
		return instance;
	}
}
