package structural.decorator.design.pattern.processor;

import structural.decorator.design.pattern.decorator.Decorator;
import structural.decorator.design.pattern.existing.SubNumber;


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