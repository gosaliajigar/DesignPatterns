package com.decorator.design.existing;

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