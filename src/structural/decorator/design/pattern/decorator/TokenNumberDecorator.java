package structural.decorator.design.pattern.decorator;

import structural.decorator.design.pattern.existing.TokenNumber;

/**
 * @author "Jigar Gosalia"
 *
 */
public class TokenNumberDecorator {

	private TokenNumber token;

	/**
	 * 
	 */
	public TokenNumberDecorator(final TokenNumber token) {
		this.token = token;
		// add a description to the number
		System.out.print("Token number: ");
		// printed
		this.token.print();
	}
}