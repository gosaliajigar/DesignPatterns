package creational.builder.design.pattern.processor;


import creational.builder.design.pattern.abstractbuilder.PizzaBuilder;
import creational.builder.design.pattern.concretebuilder.HawaiianPizzaBuilder;
import creational.builder.design.pattern.concretebuilder.VegeterianPizzaBuilder;
import creational.builder.design.pattern.director.Waiter;
import creational.builder.design.pattern.product.Pizza;

/**
 * Builder Design Pattern : Creational Design Pattern<br>
 * <br>
 * Construct a complex object from simple objects step by step. 
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
