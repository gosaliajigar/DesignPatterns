package com.decorator.design.processor;

import com.decorator.design.decorator.Decorator;
import com.decorator.design.existing.SubNumber;

/**
 * Decorator Design Pattern : Structural Design Pattern<br>
 * <br>
 * Attach additional responsibilities or functions to an object dynamically or
 * statically. Also known as Wrapper.
 * 
 * @author "Jigar Gosalia"
 *
 */
public class MainProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Attaching additional wrapper
		new Decorator();
		new SubNumber();
	}
}