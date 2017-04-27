package structural.adapter.design.pattern.implemetations;

import structural.adapter.design.pattern.interfaces.Clean;

/**
 * Existing Class.
 * 
 * @author "Jigar Gosalia"
 *
 */
public class Workshop implements Clean {

	/* (non-Javadoc)
	 * @see structural.adapter.design.pattern.interfaces.Clean#makeClean()
	 */
	public void makeClean() {
		System.out.println("Clean Workshop");
	}
}