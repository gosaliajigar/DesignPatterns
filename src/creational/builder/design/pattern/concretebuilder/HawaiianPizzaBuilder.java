package creational.builder.design.pattern.concretebuilder;

import creational.builder.design.pattern.abstractbuilder.PizzaBuilder;

/**
 * ConcreteBuilder that builds Hawaiian Pizza
 * 
 * @author "Jigar Gosalia"
 *
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

	/* (non-Javadoc)
	 * @see creational.builder.design.pattern.abstractbuilder.PizzaBuilder#buildDough()
	 */
	@Override
	public void buildDough() {
		this.pizza.setDough("HAND-TOSTED");
	}

	/* (non-Javadoc)
	 * @see creational.builder.design.pattern.abstractbuilder.PizzaBuilder#buildSauce()
	 */
	@Override
	public void buildSauce() {
		this.pizza.setSauce("MEDIUM");
	}

	/* (non-Javadoc)
	 * @see creational.builder.design.pattern.abstractbuilder.PizzaBuilder#buildToppings()
	 */
	@Override
	public void buildToppings() {
		this.pizza.setToppings("greenPepper:redPepper:mushRoom");
	}
}
