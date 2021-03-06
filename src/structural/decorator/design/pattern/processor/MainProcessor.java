package structural.decorator.design.pattern.processor;

import structural.decorator.design.pattern.decorator.TokenNumberDecorator;
import structural.decorator.design.pattern.existing.TokenNumber;


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
		new TokenNumberDecorator(new TokenNumber());
	}
}