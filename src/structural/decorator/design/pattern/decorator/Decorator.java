package structural.decorator.design.pattern.decorator;

import structural.decorator.design.pattern.existing.Number;

/**
 * @author "Jigar Gosalia"
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