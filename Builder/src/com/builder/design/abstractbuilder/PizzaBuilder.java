package com.builder.design.abstractbuilder;

import com.builder.design.product.Pizza;

/**
 * 
 * AbstractBuilder
 * 
 * @author "Jigar Gosalia"
 * 
 */
public abstract class PizzaBuilder {

	/**
	 * Product Pizza
	 */
	protected Pizza pizza;

	/**
	 * @return
	 */
	public Pizza getPizza() {
		return this.pizza;
	}

	/**
	 * createPizzaProduct gets Pizza product
	 */
	public void createPizzaProduct() {
		this.pizza = new Pizza();
	}

	/**
	 * Abstract buildDough
	 */
	public abstract void buildDough();

	/**
	 * Abstract buildSauce
	 */
	public abstract void buildSauce();

	/**
	 * Abstract buildToppings
	 */
	public abstract void buildToppings();
}
