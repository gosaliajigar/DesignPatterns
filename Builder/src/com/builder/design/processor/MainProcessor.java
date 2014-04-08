package com.builder.design.processor;

import com.builder.design.abstractbuilder.PizzaBuilder;
import com.builder.design.concretebuilder.HawaiianPizzaBuilder;
import com.builder.design.concretebuilder.VegeterianPizzaBuilder;
import com.builder.design.director.Waiter;
import com.builder.design.product.Pizza;

/**
 * MainProcessor processing requests
 * 
 * @author "Jigar Gosalia"
 *
 */
public class MainProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Waiter waiter = new Waiter();

		PizzaBuilder vegeterianPizzaBuilder = new VegeterianPizzaBuilder();
		waiter.constructPizza(vegeterianPizzaBuilder);
		Pizza veggiePizza = waiter.getPizza(vegeterianPizzaBuilder);
		System.out.println("\nOrdered Pizza : \n" + veggiePizza.toString());

		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		waiter.constructPizza(hawaiianPizzaBuilder);
		Pizza hawaiianPizza = waiter.getPizza(hawaiianPizzaBuilder);
		System.out.println("\nOrdered Pizza : \n" + hawaiianPizza.toString());
	}
}
