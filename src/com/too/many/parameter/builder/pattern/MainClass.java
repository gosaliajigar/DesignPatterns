package com.too.many.parameter.builder.pattern;

import com.too.many.parameter.builder.pattern.Person.PersonBuilder;

/**
 * @author "Jigar Gosalia"
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PersonBuilder builder = new PersonBuilder();
		Person person = builder.salutation("Mr.").first("Jigar").middle("R").last("Gosalia").streetName("1234 Street")
				.city("San Jose").state("CA").zipCode("95131").isMale(true).build();
		System.out.println(person);
	}
}
