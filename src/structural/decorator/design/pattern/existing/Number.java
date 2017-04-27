package structural.decorator.design.pattern.existing;

import java.util.Random;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Number {

	/**
	 * 
	 */
	public void print() {
		System.out.println(new Random().nextInt());
	}
}