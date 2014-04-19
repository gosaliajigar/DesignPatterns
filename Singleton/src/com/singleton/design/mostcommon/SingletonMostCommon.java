package com.singleton.design.mostcommon;

/**
 * @author "Jigar Gosalia"
 *
 */
public class SingletonMostCommon {

	/**
	 * 
	 */
	private static SingletonMostCommon instance = new SingletonMostCommon();

	/**
	 * 
	 */
	private SingletonMostCommon() {
		System.out.println("Instantiated SingletonMostCommon ... ");
	}

	/**
	 * @return
	 */
	public static SingletonMostCommon getInstance() {
		return instance;
	}
}
