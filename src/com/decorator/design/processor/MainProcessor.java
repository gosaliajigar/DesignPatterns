package com.decorator.design.processor;

import com.decorator.design.decorator.Decorator;
import com.decorator.design.existing.SubNumber;

/**
 * @author "Jigar Gosalia"
 *
 */
public class MainProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Decorator();
		new SubNumber();
	}
}