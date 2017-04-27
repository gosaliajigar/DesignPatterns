package structural.adapter.design.pattern.implemetations;

import structural.adapter.design.pattern.interfaces.Gear;

/**
 * Existing Class.
 * 
 * @author "Jigar Gosalia"
 *
 */
public class Cycle implements Gear {

	/* (non-Javadoc)
	 * @see structural.adapter.design.pattern.interfaces.Gear#manualGear()
	 */
	public void manualGear() {
		System.out.println("Use Manual Gears");
	}
}