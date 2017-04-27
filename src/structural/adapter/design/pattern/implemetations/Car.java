package structural.adapter.design.pattern.implemetations;

import structural.adapter.design.pattern.interfaces.AdvancedGear;

/**
 * New Class implementing new extended interface.
 * 
 * @author "Jigar Gosalia"
 *
 */
public class Car implements AdvancedGear {

	public void manualGear() {
		System.out.println("Use Manual Gear");
	}

	public void automaticGear() {
		System.out.println("Use Automatic Gear");
	}
}