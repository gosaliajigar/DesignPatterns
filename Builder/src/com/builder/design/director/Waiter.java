package com.builder.design.director;

import com.builder.design.abstractbuilder.PizzaBuilder;
import com.builder.design.product.Pizza;

/**
 * Director
 * 
 * @author "Jigar Gosalia"
 *
 */
public class Waiter {

	/**
	 * getPizza using PizzaBuilder
	 * 
	 * @param pizzaBuilder
	 * @return
	 */
	public Pizza getPizza(PizzaBuilder pizzaBuilder) {
		return pizzaBuilder.getPizza();
	}

	/**
	 * Construct Pizza in predefined sequence
	 * 
	 * @param pizzaBuilder
	 */
	public void constructPizza(PizzaBuilder pizzaBuilder){
		pizzaBuilder.createPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildToppings();
	}
}
