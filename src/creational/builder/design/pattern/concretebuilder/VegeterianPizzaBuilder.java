package creational.builder.design.pattern.concretebuilder;

import creational.builder.design.pattern.abstractbuilder.PizzaBuilder;

/**
 * ConcreteBuilder that builds Vegeterian Pizza
 * 
 * @author "Jigar Gosalia"
 *
 */
public class VegeterianPizzaBuilder extends PizzaBuilder {

	/* (non-Javadoc)
	 * @see creational.builder.design.pattern.abstractbuilder.PizzaBuilder#buildDough()
	 */
	@Override
	public void buildDough() {
		this.pizza.setDough("PAN");
	}

	/* (non-Javadoc)
	 * @see creational.builder.design.pattern.abstractbuilder.PizzaBuilder#buildSauce()
	 */
	@Override
	public void buildSauce() {
		this.pizza.setSauce("HOT");
	}

	/* (non-Javadoc)
	 * @see creational.builder.design.pattern.abstractbuilder.PizzaBuilder#buildToppings()
	 */
	@Override
	public void buildToppings() {
		this.pizza.setToppings("jalapeno:onion:tomato");
	}
}
