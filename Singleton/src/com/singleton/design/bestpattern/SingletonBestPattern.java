package com.singleton.design.bestpattern;

/**
 * @author "Jigar Gosalia"
 *
 */
public class SingletonBestPattern {

	/**
	 * 
	 */
	private SingletonBestPattern() {
		System.out.println("Instantiated SingletonBestPattern ... ");
	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * SingletonBestPattern.getInstance() or the first access
	 * to SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		private static final SingletonBestPattern INSTANCE = new SingletonBestPattern();
	}

	/**
	 * @return
	 */
	public static SingletonBestPattern getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
