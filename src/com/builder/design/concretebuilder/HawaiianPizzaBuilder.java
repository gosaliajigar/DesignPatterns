package com.builder.design.concretebuilder;

import com.builder.design.abstractbuilder.PizzaBuilder;

/**
 * ConcreteBuilder that builds Hawaiian Pizza
 * 
 * @author "Jigar Gosalia"
 *
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

	/* (non-Javadoc)
	 * @see com.builder.design.abstractbuilder.PizzaBuilder#buildDough()
	 */
	@Override
	public void buildDough() {
		this.pizza.setDough("HAND-TOSTED");
	}

	/* (non-Javadoc)
	 * @see com.builder.design.abstractbuilder.PizzaBuilder#buildSauce()
	 */
	@Override
	public void buildSauce() {
		this.pizza.setSauce("MEDIUM");
	}

	/* (non-Javadoc)
	 * @see com.builder.design.abstractbuilder.PizzaBuilder#buildToppings()
	 */
	@Override
	public void buildToppings() {
		this.pizza.setToppings("greenPepper:redPepper:mushRoom");
	}
}
