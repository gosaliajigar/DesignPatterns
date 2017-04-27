package structural.adapter.design.pattern.implemetations;

import structural.adapter.design.pattern.interfaces.Extra;

/**
 * New Class implementing new extended interface.
 * 
 * @author "Jigar Gosalia"
 *
 */
public class Facility implements Extra {

	/* (non-Javadoc)
	 * @see structural.adapter.design.pattern.interfaces.Clean#makeClean()
	 */
	public void makeClean() {
		System.out.println("Clean Facility");
	}

	/* (non-Javadoc)
	 * @see structural.adapter.design.pattern.interfaces.Extra#takeCare()
	 */
	public void takeCare() {
		System.out.println("Care has been taken");
	}
}