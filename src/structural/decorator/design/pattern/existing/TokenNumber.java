package structural.decorator.design.pattern.existing;

import java.util.Random;

/**
 * @author "Jigar Gosalia"
 *
 */
public class TokenNumber {

	/**
	 * 
	 */
	public void print() {
		System.out.println(new Random(999999L).nextInt());
	}
}