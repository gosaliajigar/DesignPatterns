package structural.adapter.design.pattern.processor;

import structural.adapter.design.pattern.implemetations.Car;
import structural.adapter.design.pattern.implemetations.Cycle;
import structural.adapter.design.pattern.implemetations.Bike;
import structural.adapter.design.pattern.interfaces.Gear;
import structural.adapter.design.pattern.interfaces.AdvancedGear;


/**
 * Adapter Design Pattern : Structural Design Pattern<br>
 * <br>
 * Convert the existing interfaces to a new interface to achieve compatibility
 * and re-usability of the unrelated classes in one application. Also known as
 * Wrapper pattern.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class MainProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdvancedGear car = new Car();
		MainProcessor.doTasks(car);
		Gear cycle = new Cycle();
		Gear bike = new Bike();
		MainProcessor.doTasks(cycle);
		MainProcessor.doTasks(bike);
	}

	// In order to reuse Cycle and Bike classes,
	// we create an adapter interface AdvancedGear and
	// add new job automaticGear in the system.
	public static void doTasks(Gear job) {
		if (job instanceof AdvancedGear) {
			((AdvancedGear) job).manualGear();
			((AdvancedGear) job).automaticGear();
		} else if (job instanceof Gear) {
			((Gear) job).manualGear();
		}
	}
}
