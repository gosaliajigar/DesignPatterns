package structural.adapter.design.pattern.processor;

import structural.adapter.design.pattern.implemetations.Facility;
import structural.adapter.design.pattern.implemetations.Office;
import structural.adapter.design.pattern.implemetations.Workshop;
import structural.adapter.design.pattern.interfaces.Clean;
import structural.adapter.design.pattern.interfaces.Extra;


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
		Extra extra = new Facility();
		MainProcessor.doTasks(extra);
		Clean c1 = new Office();
		Clean c2 = new Workshop();
		MainProcessor.doTasks(c1);
		MainProcessor.doTasks(c2);
	}

	// In order to reuse Workshop and Office classes,
	// we create an adapter interface Extra and
	// add new job takeCare in the system.
	public static void doTasks(Clean job) {
		if (job instanceof Extra) {
			((Extra) job).takeCare();
			((Extra) job).makeClean();
		} else if (job instanceof Clean) {
			((Clean) job).makeClean();
		}
	}
}
