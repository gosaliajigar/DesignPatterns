package com.decorator.design.decorator;

import com.decorator.design.existing.Number;

/**
 * @author "Jigar Gosali"
 *
 */
public class Decorator {

	/**
	 * 
	 */
	public Decorator() {
		// add a description to the number
		System.out.print("Random number: ");
		// printed
		new Number().print();
	}
}