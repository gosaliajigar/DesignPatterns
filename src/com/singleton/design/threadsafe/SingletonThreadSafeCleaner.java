package com.singleton.design.threadsafe;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonThreadSafeCleaner {

	/**
	 * 
	 */
	private static volatile SingletonThreadSafeCleaner instance = null;

	/**
	 * 
	 */
	private SingletonThreadSafeCleaner() {
		System.out.println("Instantiated SingletonThreadSafeCleaner ... ");
	}

	/**
	 * @return
	 */
	public static synchronized SingletonThreadSafeCleaner getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafeCleaner();
		} else {
			System.out
					.println("Returning Existing SingletonThreadSafeCleaner ... ");
		}
		return instance;
	}
}
